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


class ObjsExternalOrgMigrations(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "current",
            "date_updated",
        }
        
        class properties:
            
            
            class current(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    
                    class items(
                        schemas.DictSchema
                    ):
                    
                    
                        class MetaOapg:
                            required = {
                                "team_id",
                                "date_started",
                            }
                            
                            class properties:
                                date_started = schemas.IntSchema
                                team_id = schemas.StrSchema
                                __annotations__ = {
                                    "date_started": date_started,
                                    "team_id": team_id,
                                }
                        
                        team_id: MetaOapg.properties.team_id
                        date_started: MetaOapg.properties.date_started
                        
                        @typing.overload
                        def __getitem__(self, name: typing_extensions.Literal["date_started"]) -> MetaOapg.properties.date_started: ...
                        
                        @typing.overload
                        def __getitem__(self, name: typing_extensions.Literal["team_id"]) -> MetaOapg.properties.team_id: ...
                        
                        @typing.overload
                        def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
                        
                        def __getitem__(self, name: typing.Union[typing_extensions.Literal["date_started", "team_id", ], str]):
                            # dict_instance[name] accessor
                            return super().__getitem__(name)
                        
                        
                        @typing.overload
                        def get_item_oapg(self, name: typing_extensions.Literal["date_started"]) -> MetaOapg.properties.date_started: ...
                        
                        @typing.overload
                        def get_item_oapg(self, name: typing_extensions.Literal["team_id"]) -> MetaOapg.properties.team_id: ...
                        
                        @typing.overload
                        def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
                        
                        def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["date_started", "team_id", ], str]):
                            return super().get_item_oapg(name)
                        
                    
                        def __new__(
                            cls,
                            *args: typing.Union[dict, frozendict.frozendict, ],
                            team_id: typing.Union[MetaOapg.properties.team_id, str, ],
                            date_started: typing.Union[MetaOapg.properties.date_started, decimal.Decimal, int, ],
                            _configuration: typing.Optional[schemas.Configuration] = None,
                            **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                        ) -> 'items':
                            return super().__new__(
                                cls,
                                *args,
                                team_id=team_id,
                                date_started=date_started,
                                _configuration=_configuration,
                                **kwargs,
                            )
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, dict, frozendict.frozendict, ]], typing.List[typing.Union[MetaOapg.items, dict, frozendict.frozendict, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'current':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            date_updated = schemas.IntSchema
            __annotations__ = {
                "current": current,
                "date_updated": date_updated,
            }
    
    current: MetaOapg.properties.current
    date_updated: MetaOapg.properties.date_updated
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["current"]) -> MetaOapg.properties.current: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date_updated"]) -> MetaOapg.properties.date_updated: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["current", "date_updated", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["current"]) -> MetaOapg.properties.current: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date_updated"]) -> MetaOapg.properties.date_updated: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["current", "date_updated", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        current: typing.Union[MetaOapg.properties.current, list, tuple, ],
        date_updated: typing.Union[MetaOapg.properties.date_updated, decimal.Decimal, int, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'ObjsExternalOrgMigrations':
        return super().__new__(
            cls,
            *args,
            current=current,
            date_updated=date_updated,
            _configuration=_configuration,
            **kwargs,
        )