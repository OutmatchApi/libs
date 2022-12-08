# coding: utf-8

"""
    api.video

    api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
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

from testing-api-video import schemas  # noqa: F401


class VideostatusEncoding(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class properties:
        
            @staticmethod
            def metadata() -> typing.Type['VideostatusEncodingMetadata']:
                return VideostatusEncodingMetadata
            playable = schemas.BoolSchema
            
            
            class qualities(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['Quality']:
                        return Quality
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['Quality'], typing.List['Quality']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'qualities':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'Quality':
                    return super().__getitem__(i)
            __annotations__ = {
                "metadata": metadata,
                "playable": playable,
                "qualities": qualities,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["metadata"]) -> 'VideostatusEncodingMetadata': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["playable"]) -> MetaOapg.properties.playable: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["qualities"]) -> MetaOapg.properties.qualities: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["metadata", "playable", "qualities", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["metadata"]) -> typing.Union['VideostatusEncodingMetadata', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["playable"]) -> typing.Union[MetaOapg.properties.playable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["qualities"]) -> typing.Union[MetaOapg.properties.qualities, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["metadata", "playable", "qualities", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        metadata: typing.Union['VideostatusEncodingMetadata', schemas.Unset] = schemas.unset,
        playable: typing.Union[MetaOapg.properties.playable, bool, schemas.Unset] = schemas.unset,
        qualities: typing.Union[MetaOapg.properties.qualities, list, tuple, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'VideostatusEncoding':
        return super().__new__(
            cls,
            *args,
            metadata=metadata,
            playable=playable,
            qualities=qualities,
            _configuration=_configuration,
            **kwargs,
        )

from testing-api-video.model.quality import Quality
from testing-api-video.model.videostatus_encoding_metadata import VideostatusEncodingMetadata
