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

from apivideo import schemas  # noqa: F401


class VideoUpdatePayload(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class properties:
            description = schemas.StrSchema
            
            
            class metadata(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['Metadata']:
                        return Metadata
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['Metadata'], typing.List['Metadata']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'metadata':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'Metadata':
                    return super().__getitem__(i)
            mp4Support = schemas.BoolSchema
            panoramic = schemas.BoolSchema
            playerId = schemas.StrSchema
            public = schemas.BoolSchema
            
            
            class tags(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    items = schemas.StrSchema
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, str, ]], typing.List[typing.Union[MetaOapg.items, str, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'tags':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            title = schemas.StrSchema
            __annotations__ = {
                "description": description,
                "metadata": metadata,
                "mp4Support": mp4Support,
                "panoramic": panoramic,
                "playerId": playerId,
                "public": public,
                "tags": tags,
                "title": title,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["description"]) -> MetaOapg.properties.description: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["metadata"]) -> MetaOapg.properties.metadata: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["mp4Support"]) -> MetaOapg.properties.mp4Support: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["panoramic"]) -> MetaOapg.properties.panoramic: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["playerId"]) -> MetaOapg.properties.playerId: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["public"]) -> MetaOapg.properties.public: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tags"]) -> MetaOapg.properties.tags: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["title"]) -> MetaOapg.properties.title: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["description", "metadata", "mp4Support", "panoramic", "playerId", "public", "tags", "title", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["description"]) -> typing.Union[MetaOapg.properties.description, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["metadata"]) -> typing.Union[MetaOapg.properties.metadata, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["mp4Support"]) -> typing.Union[MetaOapg.properties.mp4Support, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["panoramic"]) -> typing.Union[MetaOapg.properties.panoramic, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["playerId"]) -> typing.Union[MetaOapg.properties.playerId, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["public"]) -> typing.Union[MetaOapg.properties.public, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tags"]) -> typing.Union[MetaOapg.properties.tags, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["title"]) -> typing.Union[MetaOapg.properties.title, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["description", "metadata", "mp4Support", "panoramic", "playerId", "public", "tags", "title", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        description: typing.Union[MetaOapg.properties.description, str, schemas.Unset] = schemas.unset,
        metadata: typing.Union[MetaOapg.properties.metadata, list, tuple, schemas.Unset] = schemas.unset,
        mp4Support: typing.Union[MetaOapg.properties.mp4Support, bool, schemas.Unset] = schemas.unset,
        panoramic: typing.Union[MetaOapg.properties.panoramic, bool, schemas.Unset] = schemas.unset,
        playerId: typing.Union[MetaOapg.properties.playerId, str, schemas.Unset] = schemas.unset,
        public: typing.Union[MetaOapg.properties.public, bool, schemas.Unset] = schemas.unset,
        tags: typing.Union[MetaOapg.properties.tags, list, tuple, schemas.Unset] = schemas.unset,
        title: typing.Union[MetaOapg.properties.title, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'VideoUpdatePayload':
        return super().__new__(
            cls,
            *args,
            description=description,
            metadata=metadata,
            mp4Support=mp4Support,
            panoramic=panoramic,
            playerId=playerId,
            public=public,
            tags=tags,
            title=title,
            _configuration=_configuration,
            **kwargs,
        )

from apivideo.model.metadata import Metadata