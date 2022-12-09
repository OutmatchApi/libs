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


class VideostatusEncodingMetadata(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class properties:
            aspectRatio = schemas.StrSchema
            audioCodec = schemas.StrSchema
            bitrate = schemas.NumberSchema
            duration = schemas.IntSchema
            framerate = schemas.IntSchema
            height = schemas.IntSchema
            samplerate = schemas.IntSchema
            videoCodec = schemas.StrSchema
            width = schemas.IntSchema
            __annotations__ = {
                "aspectRatio": aspectRatio,
                "audioCodec": audioCodec,
                "bitrate": bitrate,
                "duration": duration,
                "framerate": framerate,
                "height": height,
                "samplerate": samplerate,
                "videoCodec": videoCodec,
                "width": width,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["aspectRatio"]) -> MetaOapg.properties.aspectRatio: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["audioCodec"]) -> MetaOapg.properties.audioCodec: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["bitrate"]) -> MetaOapg.properties.bitrate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["duration"]) -> MetaOapg.properties.duration: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["framerate"]) -> MetaOapg.properties.framerate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["height"]) -> MetaOapg.properties.height: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["samplerate"]) -> MetaOapg.properties.samplerate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["videoCodec"]) -> MetaOapg.properties.videoCodec: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["width"]) -> MetaOapg.properties.width: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["aspectRatio", "audioCodec", "bitrate", "duration", "framerate", "height", "samplerate", "videoCodec", "width", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["aspectRatio"]) -> typing.Union[MetaOapg.properties.aspectRatio, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["audioCodec"]) -> typing.Union[MetaOapg.properties.audioCodec, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["bitrate"]) -> typing.Union[MetaOapg.properties.bitrate, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["duration"]) -> typing.Union[MetaOapg.properties.duration, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["framerate"]) -> typing.Union[MetaOapg.properties.framerate, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["height"]) -> typing.Union[MetaOapg.properties.height, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["samplerate"]) -> typing.Union[MetaOapg.properties.samplerate, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["videoCodec"]) -> typing.Union[MetaOapg.properties.videoCodec, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["width"]) -> typing.Union[MetaOapg.properties.width, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["aspectRatio", "audioCodec", "bitrate", "duration", "framerate", "height", "samplerate", "videoCodec", "width", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        aspectRatio: typing.Union[MetaOapg.properties.aspectRatio, str, schemas.Unset] = schemas.unset,
        audioCodec: typing.Union[MetaOapg.properties.audioCodec, str, schemas.Unset] = schemas.unset,
        bitrate: typing.Union[MetaOapg.properties.bitrate, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        duration: typing.Union[MetaOapg.properties.duration, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        framerate: typing.Union[MetaOapg.properties.framerate, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        height: typing.Union[MetaOapg.properties.height, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        samplerate: typing.Union[MetaOapg.properties.samplerate, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        videoCodec: typing.Union[MetaOapg.properties.videoCodec, str, schemas.Unset] = schemas.unset,
        width: typing.Union[MetaOapg.properties.width, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'VideostatusEncodingMetadata':
        return super().__new__(
            cls,
            *args,
            aspectRatio=aspectRatio,
            audioCodec=audioCodec,
            bitrate=bitrate,
            duration=duration,
            framerate=framerate,
            height=height,
            samplerate=samplerate,
            videoCodec=videoCodec,
            width=width,
            _configuration=_configuration,
            **kwargs,
        )
