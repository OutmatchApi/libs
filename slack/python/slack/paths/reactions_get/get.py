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

from slack.model.objs_message import ObjsMessage
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.objs_file import ObjsFile
from slack.model.objs_comment import ObjsComment
from slack.model.defs_ok_true import DefsOkTrue
from slack.model.defs_channel import DefsChannel

from . import path

# Query params
TokenSchema = schemas.StrSchema
ChannelSchema = schemas.StrSchema
FileSchema = schemas.StrSchema
FileCommentSchema = schemas.StrSchema
FullSchema = schemas.BoolSchema
TimestampSchema = schemas.StrSchema
RequestRequiredQueryParams = typing_extensions.TypedDict(
    'RequestRequiredQueryParams',
    {
        'token': typing.Union[TokenSchema, str, ],
    }
)
RequestOptionalQueryParams = typing_extensions.TypedDict(
    'RequestOptionalQueryParams',
    {
        'channel': typing.Union[ChannelSchema, str, ],
        'file': typing.Union[FileSchema, str, ],
        'file_comment': typing.Union[FileCommentSchema, str, ],
        'full': typing.Union[FullSchema, bool, ],
        'timestamp': typing.Union[TimestampSchema, str, ],
    },
    total=False
)


class RequestQueryParams(RequestRequiredQueryParams, RequestOptionalQueryParams):
    pass


request_query_token = api_client.QueryParameter(
    name="token",
    style=api_client.ParameterStyle.FORM,
    schema=TokenSchema,
    required=True,
    explode=True,
)
request_query_channel = api_client.QueryParameter(
    name="channel",
    style=api_client.ParameterStyle.FORM,
    schema=ChannelSchema,
    explode=True,
)
request_query_file = api_client.QueryParameter(
    name="file",
    style=api_client.ParameterStyle.FORM,
    schema=FileSchema,
    explode=True,
)
request_query_file_comment = api_client.QueryParameter(
    name="file_comment",
    style=api_client.ParameterStyle.FORM,
    schema=FileCommentSchema,
    explode=True,
)
request_query_full = api_client.QueryParameter(
    name="full",
    style=api_client.ParameterStyle.FORM,
    schema=FullSchema,
    explode=True,
)
request_query_timestamp = api_client.QueryParameter(
    name="timestamp",
    style=api_client.ParameterStyle.FORM,
    schema=TimestampSchema,
    explode=True,
)
_auth = [
    'slackAuth',
]


class SchemaFor200ResponseBodyApplicationJson(
    schemas.ListSchema
):


    class MetaOapg:
        
        
        class items(
            schemas.ComposedSchema,
        ):
        
        
            class MetaOapg:
                
                
                class any_of_0(
                    schemas.DictSchema
                ):
                
                
                    class MetaOapg:
                        required = {
                            "channel",
                            "message",
                            "ok",
                            "type",
                        }
                        
                        class properties:
                        
                            @staticmethod
                            def channel() -> typing.Type['DefsChannel']:
                                return DefsChannel
                        
                            @staticmethod
                            def message() -> typing.Type['ObjsMessage']:
                                return ObjsMessage
                        
                            @staticmethod
                            def ok() -> typing.Type['DefsOkTrue']:
                                return DefsOkTrue
                            
                            
                            class type(
                                schemas.EnumBase,
                                schemas.StrSchema
                            ):
                            
                            
                                class MetaOapg:
                                    enum_value_to_name = {
                                        "message": "MESSAGE",
                                    }
                                
                                @schemas.classproperty
                                def MESSAGE(cls):
                                    return cls("message")
                            __annotations__ = {
                                "channel": channel,
                                "message": message,
                                "ok": ok,
                                "type": type,
                            }
                        additional_properties = schemas.NotAnyTypeSchema
                    
                    channel: 'DefsChannel'
                    message: 'ObjsMessage'
                    ok: 'DefsOkTrue'
                    type: MetaOapg.properties.type
                    
                    @typing.overload
                    def __getitem__(self, name: typing_extensions.Literal["channel"]) -> 'DefsChannel': ...
                    
                    @typing.overload
                    def __getitem__(self, name: typing_extensions.Literal["message"]) -> 'ObjsMessage': ...
                    
                    @typing.overload
                    def __getitem__(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
                    
                    @typing.overload
                    def __getitem__(self, name: typing_extensions.Literal["type"]) -> MetaOapg.properties.type: ...
                    
                    def __getitem__(self, name: typing.Union[typing_extensions.Literal["channel"], typing_extensions.Literal["message"], typing_extensions.Literal["ok"], typing_extensions.Literal["type"], ]):
                        # dict_instance[name] accessor
                        return super().__getitem__(name)
                    
                    @typing.overload
                    def get_item_oapg(self, name: typing_extensions.Literal["channel"]) -> 'DefsChannel': ...
                    
                    @typing.overload
                    def get_item_oapg(self, name: typing_extensions.Literal["message"]) -> 'ObjsMessage': ...
                    
                    @typing.overload
                    def get_item_oapg(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
                    
                    @typing.overload
                    def get_item_oapg(self, name: typing_extensions.Literal["type"]) -> MetaOapg.properties.type: ...
                    
                    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["channel"], typing_extensions.Literal["message"], typing_extensions.Literal["ok"], typing_extensions.Literal["type"], ]):
                        return super().get_item_oapg(name)
                
                    def __new__(
                        cls,
                        *args: typing.Union[dict, frozendict.frozendict, ],
                        channel: 'DefsChannel',
                        message: 'ObjsMessage',
                        ok: 'DefsOkTrue',
                        type: typing.Union[MetaOapg.properties.type, str, ],
                        _configuration: typing.Optional[schemas.Configuration] = None,
                    ) -> 'any_of_0':
                        return super().__new__(
                            cls,
                            *args,
                            channel=channel,
                            message=message,
                            ok=ok,
                            type=type,
                            _configuration=_configuration,
                        )
                
                
                class any_of_1(
                    schemas.DictSchema
                ):
                
                
                    class MetaOapg:
                        required = {
                            "file",
                            "ok",
                            "type",
                        }
                        
                        class properties:
                        
                            @staticmethod
                            def file() -> typing.Type['ObjsFile']:
                                return ObjsFile
                        
                            @staticmethod
                            def ok() -> typing.Type['DefsOkTrue']:
                                return DefsOkTrue
                            
                            
                            class type(
                                schemas.EnumBase,
                                schemas.StrSchema
                            ):
                            
                            
                                class MetaOapg:
                                    enum_value_to_name = {
                                        "file": "FILE",
                                    }
                                
                                @schemas.classproperty
                                def FILE(cls):
                                    return cls("file")
                            __annotations__ = {
                                "file": file,
                                "ok": ok,
                                "type": type,
                            }
                        additional_properties = schemas.NotAnyTypeSchema
                    
                    file: 'ObjsFile'
                    ok: 'DefsOkTrue'
                    type: MetaOapg.properties.type
                    
                    @typing.overload
                    def __getitem__(self, name: typing_extensions.Literal["file"]) -> 'ObjsFile': ...
                    
                    @typing.overload
                    def __getitem__(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
                    
                    @typing.overload
                    def __getitem__(self, name: typing_extensions.Literal["type"]) -> MetaOapg.properties.type: ...
                    
                    def __getitem__(self, name: typing.Union[typing_extensions.Literal["file"], typing_extensions.Literal["ok"], typing_extensions.Literal["type"], ]):
                        # dict_instance[name] accessor
                        return super().__getitem__(name)
                    
                    @typing.overload
                    def get_item_oapg(self, name: typing_extensions.Literal["file"]) -> 'ObjsFile': ...
                    
                    @typing.overload
                    def get_item_oapg(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
                    
                    @typing.overload
                    def get_item_oapg(self, name: typing_extensions.Literal["type"]) -> MetaOapg.properties.type: ...
                    
                    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["file"], typing_extensions.Literal["ok"], typing_extensions.Literal["type"], ]):
                        return super().get_item_oapg(name)
                
                    def __new__(
                        cls,
                        *args: typing.Union[dict, frozendict.frozendict, ],
                        file: 'ObjsFile',
                        ok: 'DefsOkTrue',
                        type: typing.Union[MetaOapg.properties.type, str, ],
                        _configuration: typing.Optional[schemas.Configuration] = None,
                    ) -> 'any_of_1':
                        return super().__new__(
                            cls,
                            *args,
                            file=file,
                            ok=ok,
                            type=type,
                            _configuration=_configuration,
                        )
                
                
                class any_of_2(
                    schemas.DictSchema
                ):
                
                
                    class MetaOapg:
                        required = {
                            "file",
                            "comment",
                            "ok",
                            "type",
                        }
                        
                        class properties:
                        
                            @staticmethod
                            def comment() -> typing.Type['ObjsComment']:
                                return ObjsComment
                        
                            @staticmethod
                            def file() -> typing.Type['ObjsFile']:
                                return ObjsFile
                        
                            @staticmethod
                            def ok() -> typing.Type['DefsOkTrue']:
                                return DefsOkTrue
                            
                            
                            class type(
                                schemas.EnumBase,
                                schemas.StrSchema
                            ):
                            
                            
                                class MetaOapg:
                                    enum_value_to_name = {
                                        "file_comment": "FILE_COMMENT",
                                    }
                                
                                @schemas.classproperty
                                def FILE_COMMENT(cls):
                                    return cls("file_comment")
                            __annotations__ = {
                                "comment": comment,
                                "file": file,
                                "ok": ok,
                                "type": type,
                            }
                        additional_properties = schemas.NotAnyTypeSchema
                    
                    file: 'ObjsFile'
                    comment: 'ObjsComment'
                    ok: 'DefsOkTrue'
                    type: MetaOapg.properties.type
                    
                    @typing.overload
                    def __getitem__(self, name: typing_extensions.Literal["file"]) -> 'ObjsFile': ...
                    
                    @typing.overload
                    def __getitem__(self, name: typing_extensions.Literal["comment"]) -> 'ObjsComment': ...
                    
                    @typing.overload
                    def __getitem__(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
                    
                    @typing.overload
                    def __getitem__(self, name: typing_extensions.Literal["type"]) -> MetaOapg.properties.type: ...
                    
                    def __getitem__(self, name: typing.Union[typing_extensions.Literal["file"], typing_extensions.Literal["comment"], typing_extensions.Literal["ok"], typing_extensions.Literal["type"], ]):
                        # dict_instance[name] accessor
                        return super().__getitem__(name)
                    
                    @typing.overload
                    def get_item_oapg(self, name: typing_extensions.Literal["file"]) -> 'ObjsFile': ...
                    
                    @typing.overload
                    def get_item_oapg(self, name: typing_extensions.Literal["comment"]) -> 'ObjsComment': ...
                    
                    @typing.overload
                    def get_item_oapg(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
                    
                    @typing.overload
                    def get_item_oapg(self, name: typing_extensions.Literal["type"]) -> MetaOapg.properties.type: ...
                    
                    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["file"], typing_extensions.Literal["comment"], typing_extensions.Literal["ok"], typing_extensions.Literal["type"], ]):
                        return super().get_item_oapg(name)
                
                    def __new__(
                        cls,
                        *args: typing.Union[dict, frozendict.frozendict, ],
                        file: 'ObjsFile',
                        comment: 'ObjsComment',
                        ok: 'DefsOkTrue',
                        type: typing.Union[MetaOapg.properties.type, str, ],
                        _configuration: typing.Optional[schemas.Configuration] = None,
                    ) -> 'any_of_2':
                        return super().__new__(
                            cls,
                            *args,
                            file=file,
                            comment=comment,
                            ok=ok,
                            type=type,
                            _configuration=_configuration,
                        )
                
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
                        cls.any_of_2,
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
    ) -> 'SchemaFor200ResponseBodyApplicationJson':
        return super().__new__(
            cls,
            arg,
            _configuration=_configuration,
        )

    def __getitem__(self, i: int) -> MetaOapg.items:
        return super().__getitem__(i)


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
            
            
            class error(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "bad_timestamp": "BAD_TIMESTAMP",
                        "file_not_found": "FILE_NOT_FOUND",
                        "file_comment_not_found": "FILE_COMMENT_NOT_FOUND",
                        "message_not_found": "MESSAGE_NOT_FOUND",
                        "no_item_specified": "NO_ITEM_SPECIFIED",
                        "not_authed": "NOT_AUTHED",
                        "invalid_auth": "INVALID_AUTH",
                        "account_inactive": "ACCOUNT_INACTIVE",
                        "no_permission": "NO_PERMISSION",
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
                    }
                
                @schemas.classproperty
                def BAD_TIMESTAMP(cls):
                    return cls("bad_timestamp")
                
                @schemas.classproperty
                def FILE_NOT_FOUND(cls):
                    return cls("file_not_found")
                
                @schemas.classproperty
                def FILE_COMMENT_NOT_FOUND(cls):
                    return cls("file_comment_not_found")
                
                @schemas.classproperty
                def MESSAGE_NOT_FOUND(cls):
                    return cls("message_not_found")
                
                @schemas.classproperty
                def NO_ITEM_SPECIFIED(cls):
                    return cls("no_item_specified")
                
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
                def NO_PERMISSION(cls):
                    return cls("no_permission")
                
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
        
            @staticmethod
            def ok() -> typing.Type['DefsOkFalse']:
                return DefsOkFalse
            __annotations__ = {
                "callstack": callstack,
                "error": error,
                "ok": ok,
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
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["error"], typing_extensions.Literal["ok"], typing_extensions.Literal["callstack"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["error"]) -> MetaOapg.properties.error: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkFalse': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["callstack"]) -> typing.Union[MetaOapg.properties.callstack, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["error"], typing_extensions.Literal["ok"], typing_extensions.Literal["callstack"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        error: typing.Union[MetaOapg.properties.error, str, ],
        ok: 'DefsOkFalse',
        callstack: typing.Union[MetaOapg.properties.callstack, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'SchemaFor0ResponseBodyApplicationJson':
        return super().__new__(
            cls,
            *args,
            error=error,
            ok=ok,
            callstack=callstack,
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
    def _reactions_get_oapg(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
    ]: ...

    @typing.overload
    def _reactions_get_oapg(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _reactions_get_oapg(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def _reactions_get_oapg(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
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
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        used_path = path.value

        prefix_separator_iterator = None
        for parameter in (
            request_query_token,
            request_query_channel,
            request_query_file,
            request_query_file_comment,
            request_query_full,
            request_query_timestamp,
        ):
            parameter_data = query_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            if prefix_separator_iterator is None:
                prefix_separator_iterator = parameter.get_prefix_separator_iterator()
            serialized_data = parameter.serialize(parameter_data, prefix_separator_iterator)
            for serialized_value in serialized_data.values():
                used_path += serialized_value

        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)

        response = self.api_client.call_api(
            resource_path=used_path,
            method='get'.upper(),
            headers=_headers,
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


class ReactionsGet(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    @typing.overload
    def reactions_get(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
    ]: ...

    @typing.overload
    def reactions_get(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def reactions_get(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def reactions_get(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._reactions_get_oapg(
            query_params=query_params,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


class ApiForget(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    @typing.overload
    def get(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
    ]: ...

    @typing.overload
    def get(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def get(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseForDefault,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def get(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._reactions_get_oapg(
            query_params=query_params,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


