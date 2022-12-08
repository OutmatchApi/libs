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


class ObjsSubteam(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "date_delete",
            "date_update",
            "deleted_by",
            "description",
            "is_external",
            "handle",
            "team_id",
            "created_by",
            "auto_type",
            "prefs",
            "is_subteam",
            "date_create",
            "name",
            "updated_by",
            "is_usergroup",
            "id",
            "auto_provision",
            "enterprise_subteam_id",
        }
        
        class properties:
            auto_provision = schemas.BoolSchema
            
            
            class auto_type(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    
                    class items(
                        schemas.ComposedSchema,
                    ):
                    
                    
                        class MetaOapg:
                            any_of_0 = schemas.AnyTypeSchema
                            
                            
                            class any_of_1(
                                schemas.EnumBase,
                                schemas.StrSchema
                            ):
                                
                                @schemas.classproperty
                                def OWNER(cls):
                                    return cls("owner")
                                
                                @schemas.classproperty
                                def ADMIN(cls):
                                    return cls("admin")
                            
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
                                    cls.any_of_0,
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
                ) -> 'auto_type':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
        
            @staticmethod
            def created_by() -> typing.Type['DefsUserId']:
                return DefsUserId
            date_create = schemas.IntSchema
            date_delete = schemas.IntSchema
            date_update = schemas.IntSchema
            
            
            class deleted_by(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    
                    class items(
                        schemas.ComposedSchema,
                    ):
                    
                    
                        class MetaOapg:
                            any_of_0 = schemas.AnyTypeSchema
                            
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
                                    cls.any_of_0,
                                    DefsUserId,
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
                ) -> 'deleted_by':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            description = schemas.StrSchema
            enterprise_subteam_id = schemas.StrSchema
            handle = schemas.StrSchema
        
            @staticmethod
            def id() -> typing.Type['DefsSubteamId']:
                return DefsSubteamId
            is_external = schemas.BoolSchema
            is_subteam = schemas.BoolSchema
            is_usergroup = schemas.BoolSchema
            name = schemas.StrSchema
            
            
            class prefs(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    required = {
                        "channels",
                        "groups",
                    }
                    
                    class properties:
                        
                        
                        class channels(
                            schemas.ListSchema
                        ):
                        
                        
                            class MetaOapg:
                                
                                @staticmethod
                                def items() -> typing.Type['DefsChannelId']:
                                    return DefsChannelId
                        
                            def __new__(
                                cls,
                                arg: typing.Union[typing.Tuple['DefsChannelId'], typing.List['DefsChannelId']],
                                _configuration: typing.Optional[schemas.Configuration] = None,
                            ) -> 'channels':
                                return super().__new__(
                                    cls,
                                    arg,
                                    _configuration=_configuration,
                                )
                        
                            def __getitem__(self, i: int) -> 'DefsChannelId':
                                return super().__getitem__(i)
                        
                        
                        class groups(
                            schemas.ListSchema
                        ):
                        
                        
                            class MetaOapg:
                                
                                @staticmethod
                                def items() -> typing.Type['DefsGroupId']:
                                    return DefsGroupId
                        
                            def __new__(
                                cls,
                                arg: typing.Union[typing.Tuple['DefsGroupId'], typing.List['DefsGroupId']],
                                _configuration: typing.Optional[schemas.Configuration] = None,
                            ) -> 'groups':
                                return super().__new__(
                                    cls,
                                    arg,
                                    _configuration=_configuration,
                                )
                        
                            def __getitem__(self, i: int) -> 'DefsGroupId':
                                return super().__getitem__(i)
                        __annotations__ = {
                            "channels": channels,
                            "groups": groups,
                        }
                    additional_properties = schemas.NotAnyTypeSchema
                
                channels: MetaOapg.properties.channels
                groups: MetaOapg.properties.groups
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["channels"]) -> MetaOapg.properties.channels: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["groups"]) -> MetaOapg.properties.groups: ...
                
                def __getitem__(self, name: typing.Union[typing_extensions.Literal["channels"], typing_extensions.Literal["groups"], ]):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["channels"]) -> MetaOapg.properties.channels: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["groups"]) -> MetaOapg.properties.groups: ...
                
                def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["channels"], typing_extensions.Literal["groups"], ]):
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    channels: typing.Union[MetaOapg.properties.channels, list, tuple, ],
                    groups: typing.Union[MetaOapg.properties.groups, list, tuple, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'prefs':
                    return super().__new__(
                        cls,
                        *args,
                        channels=channels,
                        groups=groups,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def team_id() -> typing.Type['DefsTeam']:
                return DefsTeam
        
            @staticmethod
            def updated_by() -> typing.Type['DefsUserId']:
                return DefsUserId
            channel_count = schemas.IntSchema
            user_count = schemas.IntSchema
            
            
            class users(
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
                ) -> 'users':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'DefsUserId':
                    return super().__getitem__(i)
            __annotations__ = {
                "auto_provision": auto_provision,
                "auto_type": auto_type,
                "created_by": created_by,
                "date_create": date_create,
                "date_delete": date_delete,
                "date_update": date_update,
                "deleted_by": deleted_by,
                "description": description,
                "enterprise_subteam_id": enterprise_subteam_id,
                "handle": handle,
                "id": id,
                "is_external": is_external,
                "is_subteam": is_subteam,
                "is_usergroup": is_usergroup,
                "name": name,
                "prefs": prefs,
                "team_id": team_id,
                "updated_by": updated_by,
                "channel_count": channel_count,
                "user_count": user_count,
                "users": users,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    date_delete: MetaOapg.properties.date_delete
    date_update: MetaOapg.properties.date_update
    deleted_by: MetaOapg.properties.deleted_by
    description: MetaOapg.properties.description
    is_external: MetaOapg.properties.is_external
    handle: MetaOapg.properties.handle
    team_id: 'DefsTeam'
    created_by: 'DefsUserId'
    auto_type: MetaOapg.properties.auto_type
    prefs: MetaOapg.properties.prefs
    is_subteam: MetaOapg.properties.is_subteam
    date_create: MetaOapg.properties.date_create
    name: MetaOapg.properties.name
    updated_by: 'DefsUserId'
    is_usergroup: MetaOapg.properties.is_usergroup
    id: 'DefsSubteamId'
    auto_provision: MetaOapg.properties.auto_provision
    enterprise_subteam_id: MetaOapg.properties.enterprise_subteam_id
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date_delete"]) -> MetaOapg.properties.date_delete: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date_update"]) -> MetaOapg.properties.date_update: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["deleted_by"]) -> MetaOapg.properties.deleted_by: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["description"]) -> MetaOapg.properties.description: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_external"]) -> MetaOapg.properties.is_external: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["handle"]) -> MetaOapg.properties.handle: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["team_id"]) -> 'DefsTeam': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_by"]) -> 'DefsUserId': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["auto_type"]) -> MetaOapg.properties.auto_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["prefs"]) -> MetaOapg.properties.prefs: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_subteam"]) -> MetaOapg.properties.is_subteam: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date_create"]) -> MetaOapg.properties.date_create: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["updated_by"]) -> 'DefsUserId': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_usergroup"]) -> MetaOapg.properties.is_usergroup: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> 'DefsSubteamId': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["auto_provision"]) -> MetaOapg.properties.auto_provision: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enterprise_subteam_id"]) -> MetaOapg.properties.enterprise_subteam_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["channel_count"]) -> MetaOapg.properties.channel_count: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["user_count"]) -> MetaOapg.properties.user_count: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["users"]) -> MetaOapg.properties.users: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["date_delete"], typing_extensions.Literal["date_update"], typing_extensions.Literal["deleted_by"], typing_extensions.Literal["description"], typing_extensions.Literal["is_external"], typing_extensions.Literal["handle"], typing_extensions.Literal["team_id"], typing_extensions.Literal["created_by"], typing_extensions.Literal["auto_type"], typing_extensions.Literal["prefs"], typing_extensions.Literal["is_subteam"], typing_extensions.Literal["date_create"], typing_extensions.Literal["name"], typing_extensions.Literal["updated_by"], typing_extensions.Literal["is_usergroup"], typing_extensions.Literal["id"], typing_extensions.Literal["auto_provision"], typing_extensions.Literal["enterprise_subteam_id"], typing_extensions.Literal["channel_count"], typing_extensions.Literal["user_count"], typing_extensions.Literal["users"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date_delete"]) -> MetaOapg.properties.date_delete: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date_update"]) -> MetaOapg.properties.date_update: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["deleted_by"]) -> MetaOapg.properties.deleted_by: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["description"]) -> MetaOapg.properties.description: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_external"]) -> MetaOapg.properties.is_external: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["handle"]) -> MetaOapg.properties.handle: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["team_id"]) -> 'DefsTeam': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_by"]) -> 'DefsUserId': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["auto_type"]) -> MetaOapg.properties.auto_type: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["prefs"]) -> MetaOapg.properties.prefs: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_subteam"]) -> MetaOapg.properties.is_subteam: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date_create"]) -> MetaOapg.properties.date_create: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["updated_by"]) -> 'DefsUserId': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_usergroup"]) -> MetaOapg.properties.is_usergroup: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> 'DefsSubteamId': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["auto_provision"]) -> MetaOapg.properties.auto_provision: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["enterprise_subteam_id"]) -> MetaOapg.properties.enterprise_subteam_id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["channel_count"]) -> typing.Union[MetaOapg.properties.channel_count, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["user_count"]) -> typing.Union[MetaOapg.properties.user_count, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["users"]) -> typing.Union[MetaOapg.properties.users, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["date_delete"], typing_extensions.Literal["date_update"], typing_extensions.Literal["deleted_by"], typing_extensions.Literal["description"], typing_extensions.Literal["is_external"], typing_extensions.Literal["handle"], typing_extensions.Literal["team_id"], typing_extensions.Literal["created_by"], typing_extensions.Literal["auto_type"], typing_extensions.Literal["prefs"], typing_extensions.Literal["is_subteam"], typing_extensions.Literal["date_create"], typing_extensions.Literal["name"], typing_extensions.Literal["updated_by"], typing_extensions.Literal["is_usergroup"], typing_extensions.Literal["id"], typing_extensions.Literal["auto_provision"], typing_extensions.Literal["enterprise_subteam_id"], typing_extensions.Literal["channel_count"], typing_extensions.Literal["user_count"], typing_extensions.Literal["users"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        date_delete: typing.Union[MetaOapg.properties.date_delete, decimal.Decimal, int, ],
        date_update: typing.Union[MetaOapg.properties.date_update, decimal.Decimal, int, ],
        deleted_by: typing.Union[MetaOapg.properties.deleted_by, list, tuple, ],
        description: typing.Union[MetaOapg.properties.description, str, ],
        is_external: typing.Union[MetaOapg.properties.is_external, bool, ],
        handle: typing.Union[MetaOapg.properties.handle, str, ],
        team_id: 'DefsTeam',
        created_by: 'DefsUserId',
        auto_type: typing.Union[MetaOapg.properties.auto_type, list, tuple, ],
        prefs: typing.Union[MetaOapg.properties.prefs, dict, frozendict.frozendict, ],
        is_subteam: typing.Union[MetaOapg.properties.is_subteam, bool, ],
        date_create: typing.Union[MetaOapg.properties.date_create, decimal.Decimal, int, ],
        name: typing.Union[MetaOapg.properties.name, str, ],
        updated_by: 'DefsUserId',
        is_usergroup: typing.Union[MetaOapg.properties.is_usergroup, bool, ],
        id: 'DefsSubteamId',
        auto_provision: typing.Union[MetaOapg.properties.auto_provision, bool, ],
        enterprise_subteam_id: typing.Union[MetaOapg.properties.enterprise_subteam_id, str, ],
        channel_count: typing.Union[MetaOapg.properties.channel_count, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        user_count: typing.Union[MetaOapg.properties.user_count, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        users: typing.Union[MetaOapg.properties.users, list, tuple, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'ObjsSubteam':
        return super().__new__(
            cls,
            *args,
            date_delete=date_delete,
            date_update=date_update,
            deleted_by=deleted_by,
            description=description,
            is_external=is_external,
            handle=handle,
            team_id=team_id,
            created_by=created_by,
            auto_type=auto_type,
            prefs=prefs,
            is_subteam=is_subteam,
            date_create=date_create,
            name=name,
            updated_by=updated_by,
            is_usergroup=is_usergroup,
            id=id,
            auto_provision=auto_provision,
            enterprise_subteam_id=enterprise_subteam_id,
            channel_count=channel_count,
            user_count=user_count,
            users=users,
            _configuration=_configuration,
        )

from slack.model.defs_channel_id import DefsChannelId
from slack.model.defs_group_id import DefsGroupId
from slack.model.defs_subteam_id import DefsSubteamId
from slack.model.defs_team import DefsTeam
from slack.model.defs_user_id import DefsUserId
