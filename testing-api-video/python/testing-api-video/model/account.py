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


class Account(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class properties:
            environment = schemas.StrSchema
            
            
            class features(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    items = schemas.StrSchema
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, str, ]], typing.List[typing.Union[MetaOapg.items, str, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'features':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            
            
            class quota(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    
                    class properties:
                        quotaRemaining = schemas.NumberSchema
                        quotaTotal = schemas.NumberSchema
                        quotaUsed = schemas.NumberSchema
                        __annotations__ = {
                            "quotaRemaining": quotaRemaining,
                            "quotaTotal": quotaTotal,
                            "quotaUsed": quotaUsed,
                        }
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["quotaRemaining"]) -> MetaOapg.properties.quotaRemaining: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["quotaTotal"]) -> MetaOapg.properties.quotaTotal: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["quotaUsed"]) -> MetaOapg.properties.quotaUsed: ...
                
                @typing.overload
                def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
                
                def __getitem__(self, name: typing.Union[typing_extensions.Literal["quotaRemaining", "quotaTotal", "quotaUsed", ], str]):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["quotaRemaining"]) -> typing.Union[MetaOapg.properties.quotaRemaining, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["quotaTotal"]) -> typing.Union[MetaOapg.properties.quotaTotal, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["quotaUsed"]) -> typing.Union[MetaOapg.properties.quotaUsed, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
                
                def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["quotaRemaining", "quotaTotal", "quotaUsed", ], str]):
                    return super().get_item_oapg(name)
                
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    quotaRemaining: typing.Union[MetaOapg.properties.quotaRemaining, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
                    quotaTotal: typing.Union[MetaOapg.properties.quotaTotal, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
                    quotaUsed: typing.Union[MetaOapg.properties.quotaUsed, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'quota':
                    return super().__new__(
                        cls,
                        *args,
                        quotaRemaining=quotaRemaining,
                        quotaTotal=quotaTotal,
                        quotaUsed=quotaUsed,
                        _configuration=_configuration,
                        **kwargs,
                    )
            __annotations__ = {
                "environment": environment,
                "features": features,
                "quota": quota,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["environment"]) -> MetaOapg.properties.environment: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["features"]) -> MetaOapg.properties.features: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["quota"]) -> MetaOapg.properties.quota: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["environment", "features", "quota", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["environment"]) -> typing.Union[MetaOapg.properties.environment, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["features"]) -> typing.Union[MetaOapg.properties.features, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["quota"]) -> typing.Union[MetaOapg.properties.quota, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["environment", "features", "quota", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        environment: typing.Union[MetaOapg.properties.environment, str, schemas.Unset] = schemas.unset,
        features: typing.Union[MetaOapg.properties.features, list, tuple, schemas.Unset] = schemas.unset,
        quota: typing.Union[MetaOapg.properties.quota, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Account':
        return super().__new__(
            cls,
            *args,
            environment=environment,
            features=features,
            quota=quota,
            _configuration=_configuration,
            **kwargs,
        )
