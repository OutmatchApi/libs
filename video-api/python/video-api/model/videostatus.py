# coding: utf-8

"""
    api.video

    api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.  # noqa: E501

    The version of the OpenAPI document: 1.0.1
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

from video-api import schemas  # noqa: F401


class Videostatus(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class properties:
        
            @staticmethod
            def encoding() -> typing.Type['VideostatusEncoding']:
                return VideostatusEncoding
        
            @staticmethod
            def ingest() -> typing.Type['VideostatusIngest']:
                return VideostatusIngest
            __annotations__ = {
                "encoding": encoding,
                "ingest": ingest,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["encoding"]) -> 'VideostatusEncoding': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ingest"]) -> 'VideostatusIngest': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["encoding", "ingest", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["encoding"]) -> typing.Union['VideostatusEncoding', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ingest"]) -> typing.Union['VideostatusIngest', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["encoding", "ingest", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        encoding: typing.Union['VideostatusEncoding', schemas.Unset] = schemas.unset,
        ingest: typing.Union['VideostatusIngest', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Videostatus':
        return super().__new__(
            cls,
            *args,
            encoding=encoding,
            ingest=ingest,
            _configuration=_configuration,
            **kwargs,
        )

from video-api.model.videostatus_encoding import VideostatusEncoding
from video-api.model.videostatus_ingest import VideostatusIngest