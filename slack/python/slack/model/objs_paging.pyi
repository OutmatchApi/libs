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


class ObjsPaging(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "total",
            "page",
        }
        
        class properties:
            page = schemas.IntSchema
            total = schemas.IntSchema
            count = schemas.IntSchema
            pages = schemas.IntSchema
            per_page = schemas.IntSchema
            spill = schemas.IntSchema
            __annotations__ = {
                "page": page,
                "total": total,
                "count": count,
                "pages": pages,
                "per_page": per_page,
                "spill": spill,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    total: MetaOapg.properties.total
    page: MetaOapg.properties.page
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total"]) -> MetaOapg.properties.total: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["page"]) -> MetaOapg.properties.page: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["count"]) -> MetaOapg.properties.count: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pages"]) -> MetaOapg.properties.pages: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["per_page"]) -> MetaOapg.properties.per_page: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["spill"]) -> MetaOapg.properties.spill: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["total"], typing_extensions.Literal["page"], typing_extensions.Literal["count"], typing_extensions.Literal["pages"], typing_extensions.Literal["per_page"], typing_extensions.Literal["spill"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total"]) -> MetaOapg.properties.total: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["page"]) -> MetaOapg.properties.page: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["count"]) -> typing.Union[MetaOapg.properties.count, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["pages"]) -> typing.Union[MetaOapg.properties.pages, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["per_page"]) -> typing.Union[MetaOapg.properties.per_page, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["spill"]) -> typing.Union[MetaOapg.properties.spill, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["total"], typing_extensions.Literal["page"], typing_extensions.Literal["count"], typing_extensions.Literal["pages"], typing_extensions.Literal["per_page"], typing_extensions.Literal["spill"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        total: typing.Union[MetaOapg.properties.total, decimal.Decimal, int, ],
        page: typing.Union[MetaOapg.properties.page, decimal.Decimal, int, ],
        count: typing.Union[MetaOapg.properties.count, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        pages: typing.Union[MetaOapg.properties.pages, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        per_page: typing.Union[MetaOapg.properties.per_page, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        spill: typing.Union[MetaOapg.properties.spill, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'ObjsPaging':
        return super().__new__(
            cls,
            *args,
            total=total,
            page=page,
            count=count,
            pages=pages,
            per_page=per_page,
            spill=spill,
            _configuration=_configuration,
        )