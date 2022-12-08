# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
from urllib3._collections import HTTPHeaderDict

from slack import api_client, exceptions
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

from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue

from . import path

# body param


class SchemaForRequestBodyApplicationXWwwFormUrlencoded(
    schemas.DictSchema
):


    class MetaOapg:
        required = {
            "token",
        }
        
        class properties:
            crop_w = schemas.StrSchema
            crop_x = schemas.StrSchema
            crop_y = schemas.StrSchema
            image = schemas.StrSchema
            token = schemas.StrSchema
            __annotations__ = {
                "crop_w": crop_w,
                "crop_x": crop_x,
                "crop_y": crop_y,
                "image": image,
                "token": token,
            }
    
    token: MetaOapg.properties.token
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["crop_w"]) -> MetaOapg.properties.crop_w: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["crop_x"]) -> MetaOapg.properties.crop_x: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["crop_y"]) -> MetaOapg.properties.crop_y: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["image"]) -> MetaOapg.properties.image: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["token"]) -> MetaOapg.properties.token: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["crop_w", "crop_x", "crop_y", "image", "token", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["crop_w"]) -> typing.Union[MetaOapg.properties.crop_w, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["crop_x"]) -> typing.Union[MetaOapg.properties.crop_x, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["crop_y"]) -> typing.Union[MetaOapg.properties.crop_y, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["image"]) -> typing.Union[MetaOapg.properties.image, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["token"]) -> MetaOapg.properties.token: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["crop_w", "crop_x", "crop_y", "image", "token", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        token: typing.Union[MetaOapg.properties.token, str, ],
        crop_w: typing.Union[MetaOapg.properties.crop_w, str, schemas.Unset] = schemas.unset,
        crop_x: typing.Union[MetaOapg.properties.crop_x, str, schemas.Unset] = schemas.unset,
        crop_y: typing.Union[MetaOapg.properties.crop_y, str, schemas.Unset] = schemas.unset,
        image: typing.Union[MetaOapg.properties.image, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'SchemaForRequestBodyApplicationXWwwFormUrlencoded':
        return super().__new__(
            cls,
            *args,
            token=token,
            crop_w=crop_w,
            crop_x=crop_x,
            crop_y=crop_y,
            image=image,
            _configuration=_configuration,
            **kwargs,
        )


request_body_body = api_client.RequestBody(
    content={
        'application/x-www-form-urlencoded': api_client.MediaType(
            schema=SchemaForRequestBodyApplicationXWwwFormUrlencoded),
    },
)
_auth = [
    'slackAuth',
]


class SchemaFor200ResponseBodyApplicationJson(
    schemas.DictSchema
):


    class MetaOapg:
        required = {
            "profile",
            "ok",
        }
        
        class properties:
        
            @staticmethod
            def ok() -> typing.Type['DefsOkTrue']:
                return DefsOkTrue
            
            
            class profile(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    required = {
                        "image_32",
                        "image_original",
                        "image_1024",
                        "image_24",
                        "image_192",
                        "image_48",
                        "avatar_hash",
                        "image_72",
                        "image_512",
                    }
                    
                    class properties:
                        
                        
                        class avatar_hash(
                            schemas.StrSchema
                        ):
                        
                        
                            class MetaOapg:
                                regex=[{
                                    'pattern': r'^[0-9a-f]{12}$',  # noqa: E501
                                }]
                        image_1024 = schemas.StrSchema
                        image_192 = schemas.StrSchema
                        image_24 = schemas.StrSchema
                        image_32 = schemas.StrSchema
                        image_48 = schemas.StrSchema
                        image_512 = schemas.StrSchema
                        image_72 = schemas.StrSchema
                        image_original = schemas.StrSchema
                        __annotations__ = {
                            "avatar_hash": avatar_hash,
                            "image_1024": image_1024,
                            "image_192": image_192,
                            "image_24": image_24,
                            "image_32": image_32,
                            "image_48": image_48,
                            "image_512": image_512,
                            "image_72": image_72,
                            "image_original": image_original,
                        }
                    additional_properties = schemas.NotAnyTypeSchema
                
                image_32: MetaOapg.properties.image_32
                image_original: MetaOapg.properties.image_original
                image_1024: MetaOapg.properties.image_1024
                image_24: MetaOapg.properties.image_24
                image_192: MetaOapg.properties.image_192
                image_48: MetaOapg.properties.image_48
                avatar_hash: MetaOapg.properties.avatar_hash
                image_72: MetaOapg.properties.image_72
                image_512: MetaOapg.properties.image_512
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["image_32"]) -> MetaOapg.properties.image_32: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["image_original"]) -> MetaOapg.properties.image_original: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["image_1024"]) -> MetaOapg.properties.image_1024: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["image_24"]) -> MetaOapg.properties.image_24: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["image_192"]) -> MetaOapg.properties.image_192: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["image_48"]) -> MetaOapg.properties.image_48: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["avatar_hash"]) -> MetaOapg.properties.avatar_hash: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["image_72"]) -> MetaOapg.properties.image_72: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["image_512"]) -> MetaOapg.properties.image_512: ...
                
                def __getitem__(self, name: typing.Union[typing_extensions.Literal["image_32"], typing_extensions.Literal["image_original"], typing_extensions.Literal["image_1024"], typing_extensions.Literal["image_24"], typing_extensions.Literal["image_192"], typing_extensions.Literal["image_48"], typing_extensions.Literal["avatar_hash"], typing_extensions.Literal["image_72"], typing_extensions.Literal["image_512"], ]):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["image_32"]) -> MetaOapg.properties.image_32: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["image_original"]) -> MetaOapg.properties.image_original: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["image_1024"]) -> MetaOapg.properties.image_1024: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["image_24"]) -> MetaOapg.properties.image_24: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["image_192"]) -> MetaOapg.properties.image_192: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["image_48"]) -> MetaOapg.properties.image_48: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["avatar_hash"]) -> MetaOapg.properties.avatar_hash: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["image_72"]) -> MetaOapg.properties.image_72: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["image_512"]) -> MetaOapg.properties.image_512: ...
                
                def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["image_32"], typing_extensions.Literal["image_original"], typing_extensions.Literal["image_1024"], typing_extensions.Literal["image_24"], typing_extensions.Literal["image_192"], typing_extensions.Literal["image_48"], typing_extensions.Literal["avatar_hash"], typing_extensions.Literal["image_72"], typing_extensions.Literal["image_512"], ]):
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    image_32: typing.Union[MetaOapg.properties.image_32, str, ],
                    image_original: typing.Union[MetaOapg.properties.image_original, str, ],
                    image_1024: typing.Union[MetaOapg.properties.image_1024, str, ],
                    image_24: typing.Union[MetaOapg.properties.image_24, str, ],
                    image_192: typing.Union[MetaOapg.properties.image_192, str, ],
                    image_48: typing.Union[MetaOapg.properties.image_48, str, ],
                    avatar_hash: typing.Union[MetaOapg.properties.avatar_hash, str, ],
                    image_72: typing.Union[MetaOapg.properties.image_72, str, ],
                    image_512: typing.Union[MetaOapg.properties.image_512, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'profile':
                    return super().__new__(
                        cls,
                        *args,
                        image_32=image_32,
                        image_original=image_original,
                        image_1024=image_1024,
                        image_24=image_24,
                        image_192=image_192,
                        image_48=image_48,
                        avatar_hash=avatar_hash,
                        image_72=image_72,
                        image_512=image_512,
                        _configuration=_configuration,
                    )
            __annotations__ = {
                "ok": ok,
                "profile": profile,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    profile: MetaOapg.properties.profile
    ok: 'DefsOkTrue'
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["profile"]) -> MetaOapg.properties.profile: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["profile"], typing_extensions.Literal["ok"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["profile"]) -> MetaOapg.properties.profile: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["profile"], typing_extensions.Literal["ok"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        profile: typing.Union[MetaOapg.properties.profile, dict, frozendict.frozendict, ],
        ok: 'DefsOkTrue',
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'SchemaFor200ResponseBodyApplicationJson':
        return super().__new__(
            cls,
            *args,
            profile=profile,
            ok=ok,
            _configuration=_configuration,
        )


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        SchemaFor200ResponseBodyApplicationJson,
    ]
    headers: schemas.Unset = schemas.unset


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
)


class SchemaFor0ResponseBodyApplicationJson(
    schemas.DictSchema
):


    class MetaOapg:
        required = {
            "error",
            "ok",
        }
        
        class properties:
            callstack = schemas.StrSchema
            debug_step = schemas.StrSchema
            dims = schemas.StrSchema
            
            
            class error(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "bad_image": "BAD_IMAGE",
                        "too_large": "TOO_LARGE",
                        "too_many_frames": "TOO_MANY_FRAMES",
                        "not_found": "NOT_FOUND",
                        "not_authed": "NOT_AUTHED",
                        "invalid_auth": "INVALID_AUTH",
                        "account_inactive": "ACCOUNT_INACTIVE",
                        "token_revoked": "TOKEN_REVOKED",
                        "no_permission": "NO_PERMISSION",
                        "org_login_required": "ORG_LOGIN_REQUIRED",
                        "user_is_bot": "USER_IS_BOT",
                        "invalid_arg_name": "INVALID_ARG_NAME",
                        "invalid_array_arg": "INVALID_ARRAY_ARG",
                        "invalid_charset": "INVALID_CHARSET",
                        "invalid_form_data": "INVALID_FORM_DATA",
                        "invalid_post_type": "INVALID_POST_TYPE",
                        "missing_post_type": "MISSING_POST_TYPE",
                        "team_added_to_org": "TEAM_ADDED_TO_ORG",
                        "invalid_json": "INVALID_JSON",
                        "json_not_object": "JSON_NOT_OBJECT",
                        "request_timeout": "REQUEST_TIMEOUT",
                        "upgrade_required": "UPGRADE_REQUIRED",
                        "fatal_error": "FATAL_ERROR",
                    }
                
                @schemas.classproperty
                def BAD_IMAGE(cls):
                    return cls("bad_image")
                
                @schemas.classproperty
                def TOO_LARGE(cls):
                    return cls("too_large")
                
                @schemas.classproperty
                def TOO_MANY_FRAMES(cls):
                    return cls("too_many_frames")
                
                @schemas.classproperty
                def NOT_FOUND(cls):
                    return cls("not_found")
                
                @schemas.classproperty
                def NOT_AUTHED(cls):
                    return cls("not_authed")
                
                @schemas.classproperty
                def INVALID_AUTH(cls):
                    return cls("invalid_auth")
                
                @schemas.classproperty
                def ACCOUNT_INACTIVE(cls):
                    return cls("account_inactive")
                
                @schemas.classproperty
                def TOKEN_REVOKED(cls):
                    return cls("token_revoked")
                
                @schemas.classproperty
                def NO_PERMISSION(cls):
                    return cls("no_permission")
                
                @schemas.classproperty
                def ORG_LOGIN_REQUIRED(cls):
                    return cls("org_login_required")
                
                @schemas.classproperty
                def USER_IS_BOT(cls):
                    return cls("user_is_bot")
                
                @schemas.classproperty
                def INVALID_ARG_NAME(cls):
                    return cls("invalid_arg_name")
                
                @schemas.classproperty
                def INVALID_ARRAY_ARG(cls):
                    return cls("invalid_array_arg")
                
                @schemas.classproperty
                def INVALID_CHARSET(cls):
                    return cls("invalid_charset")
                
                @schemas.classproperty
                def INVALID_FORM_DATA(cls):
                    return cls("invalid_form_data")
                
                @schemas.classproperty
                def INVALID_POST_TYPE(cls):
                    return cls("invalid_post_type")
                
                @schemas.classproperty
                def MISSING_POST_TYPE(cls):
                    return cls("missing_post_type")
                
                @schemas.classproperty
                def TEAM_ADDED_TO_ORG(cls):
                    return cls("team_added_to_org")
                
                @schemas.classproperty
                def INVALID_JSON(cls):
                    return cls("invalid_json")
                
                @schemas.classproperty
                def JSON_NOT_OBJECT(cls):
                    return cls("json_not_object")
                
                @schemas.classproperty
                def REQUEST_TIMEOUT(cls):
                    return cls("request_timeout")
                
                @schemas.classproperty
                def UPGRADE_REQUIRED(cls):
                    return cls("upgrade_required")
                
                @schemas.classproperty
                def FATAL_ERROR(cls):
                    return cls("fatal_error")
        
            @staticmethod
            def ok() -> typing.Type['DefsOkFalse']:
                return DefsOkFalse
            time_ident = schemas.IntSchema
            __annotations__ = {
                "callstack": callstack,
                "debug_step": debug_step,
                "dims": dims,
                "error": error,
                "ok": ok,
                "time_ident": time_ident,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    error: MetaOapg.properties.error
    ok: 'DefsOkFalse'
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["error"]) -> MetaOapg.properties.error: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkFalse': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["callstack"]) -> MetaOapg.properties.callstack: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["debug_step"]) -> MetaOapg.properties.debug_step: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["dims"]) -> MetaOapg.properties.dims: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["time_ident"]) -> MetaOapg.properties.time_ident: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["error"], typing_extensions.Literal["ok"], typing_extensions.Literal["callstack"], typing_extensions.Literal["debug_step"], typing_extensions.Literal["dims"], typing_extensions.Literal["time_ident"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["error"]) -> MetaOapg.properties.error: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkFalse': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["callstack"]) -> typing.Union[MetaOapg.properties.callstack, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["debug_step"]) -> typing.Union[MetaOapg.properties.debug_step, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["dims"]) -> typing.Union[MetaOapg.properties.dims, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["time_ident"]) -> typing.Union[MetaOapg.properties.time_ident, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["error"], typing_extensions.Literal["ok"], typing_extensions.Literal["callstack"], typing_extensions.Literal["debug_step"], typing_extensions.Literal["dims"], typing_extensions.Literal["time_ident"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        error: typing.Union[MetaOapg.properties.error, str, ],
        ok: 'DefsOkFalse',
        callstack: typing.Union[MetaOapg.properties.callstack, str, schemas.Unset] = schemas.unset,
        debug_step: typing.Union[MetaOapg.properties.debug_step, str, schemas.Unset] = schemas.unset,
        dims: typing.Union[MetaOapg.properties.dims, str, schemas.Unset] = schemas.unset,
        time_ident: typing.Union[MetaOapg.properties.time_ident, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'SchemaFor0ResponseBodyApplicationJson':
        return super().__new__(
            cls,
            *args,
            error=error,
            ok=ok,
            callstack=callstack,
            debug_step=debug_step,
            dims=dims,
            time_ident=time_ident,
            _configuration=_configuration,
        )


@dataclass
class ApiResponseForDefault(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        SchemaFor0ResponseBodyApplicationJson,
    ]
    headers: schemas.Unset = schemas.unset


_response_for_default = api_client.OpenApiResponse(
    response_cls=ApiResponseForDefault,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor0ResponseBodyApplicationJson),
    },
)
_status_code_to_response = {
    '200': _response_for_200,
    'default': _response_for_default,
}
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):
    @typing.overload
    def _users_set_photo_oapg(
        self,
        content_type: typing_extensions.Literal["application/x-www-form-urlencoded"] = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
    ]: ...

    @typing.overload
    def _users_set_photo_oapg(
        self,
        content_type: str = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
    ]: ...


    @typing.overload
    def _users_set_photo_oapg(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _users_set_photo_oapg(
        self,
        content_type: str = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def _users_set_photo_oapg(
        self,
        content_type: str = 'application/x-www-form-urlencoded',
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        """
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path.value

        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)

        _fields = None
        _body = None
        if body is not schemas.unset:
            serialized_data = request_body_body.serialize(body, content_type)
            _headers.add('Content-Type', content_type)
            if 'fields' in serialized_data:
                _fields = serialized_data['fields']
            elif 'body' in serialized_data:
                _body = serialized_data['body']
        response = self.api_client.call_api(
            resource_path=used_path,
            method='post'.upper(),
            headers=_headers,
            fields=_fields,
            body=_body,
            auth_settings=_auth,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            api_response = api_client.ApiResponseWithoutDeserialization(response=response)
        else:
            response_for_status = _status_code_to_response.get(str(response.status))
            if response_for_status:
                api_response = response_for_status.deserialize(response, self.api_client.configuration)
            else:
                default_response = _status_code_to_response.get('default')
                if default_response:
                    api_response = default_response.deserialize(response, self.api_client.configuration)
                else:
                    api_response = api_client.ApiResponseWithoutDeserialization(response=response)

        if not 200 <= response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)

        return api_response


class UsersSetPhoto(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    @typing.overload
    def users_set_photo(
        self,
        content_type: typing_extensions.Literal["application/x-www-form-urlencoded"] = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
    ]: ...

    @typing.overload
    def users_set_photo(
        self,
        content_type: str = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
    ]: ...


    @typing.overload
    def users_set_photo(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def users_set_photo(
        self,
        content_type: str = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def users_set_photo(
        self,
        content_type: str = 'application/x-www-form-urlencoded',
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._users_set_photo_oapg(
            body=body,
            content_type=content_type,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


class ApiForpost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    @typing.overload
    def post(
        self,
        content_type: typing_extensions.Literal["application/x-www-form-urlencoded"] = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
    ]: ...

    @typing.overload
    def post(
        self,
        content_type: str = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
    ]: ...


    @typing.overload
    def post(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def post(
        self,
        content_type: str = ...,
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def post(
        self,
        content_type: str = 'application/x-www-form-urlencoded',
        body: typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._users_set_photo_oapg(
            body=body,
            content_type=content_type,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )

