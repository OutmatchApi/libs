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

from slack.model.objs_conversation import ObjsConversation
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue

from . import path

# Query params
TokenSchema = schemas.StrSchema
ExcludeArchivedSchema = schemas.BoolSchema
TypesSchema = schemas.StrSchema
LimitSchema = schemas.IntSchema
CursorSchema = schemas.StrSchema
RequestRequiredQueryParams = typing_extensions.TypedDict(
    'RequestRequiredQueryParams',
    {
    }
)
RequestOptionalQueryParams = typing_extensions.TypedDict(
    'RequestOptionalQueryParams',
    {
        'token': typing.Union[TokenSchema, str, ],
        'exclude_archived': typing.Union[ExcludeArchivedSchema, bool, ],
        'types': typing.Union[TypesSchema, str, ],
        'limit': typing.Union[LimitSchema, decimal.Decimal, int, ],
        'cursor': typing.Union[CursorSchema, str, ],
    },
    total=False
)


class RequestQueryParams(RequestRequiredQueryParams, RequestOptionalQueryParams):
    pass


request_query_token = api_client.QueryParameter(
    name="token",
    style=api_client.ParameterStyle.FORM,
    schema=TokenSchema,
    explode=True,
)
request_query_exclude_archived = api_client.QueryParameter(
    name="exclude_archived",
    style=api_client.ParameterStyle.FORM,
    schema=ExcludeArchivedSchema,
    explode=True,
)
request_query_types = api_client.QueryParameter(
    name="types",
    style=api_client.ParameterStyle.FORM,
    schema=TypesSchema,
    explode=True,
)
request_query_limit = api_client.QueryParameter(
    name="limit",
    style=api_client.ParameterStyle.FORM,
    schema=LimitSchema,
    explode=True,
)
request_query_cursor = api_client.QueryParameter(
    name="cursor",
    style=api_client.ParameterStyle.FORM,
    schema=CursorSchema,
    explode=True,
)
_auth = [
    'slackAuth',
]


class SchemaFor200ResponseBodyApplicationJson(
    schemas.DictSchema
):


    class MetaOapg:
        required = {
            "channels",
            "ok",
        }
        
        class properties:
            
            
            class channels(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    unique_items = True
                    
                    @staticmethod
                    def items() -> typing.Type['ObjsConversation']:
                        return ObjsConversation
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['ObjsConversation'], typing.List['ObjsConversation']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'channels':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'ObjsConversation':
                    return super().__getitem__(i)
        
            @staticmethod
            def ok() -> typing.Type['DefsOkTrue']:
                return DefsOkTrue
            
            
            class response_metadata(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    required = {
                        "next_cursor",
                    }
                    
                    class properties:
                        next_cursor = schemas.StrSchema
                        __annotations__ = {
                            "next_cursor": next_cursor,
                        }
                    additional_properties = schemas.NotAnyTypeSchema
                
                next_cursor: MetaOapg.properties.next_cursor
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["next_cursor"]) -> MetaOapg.properties.next_cursor: ...
                
                def __getitem__(self, name: typing.Union[typing_extensions.Literal["next_cursor"], ]):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["next_cursor"]) -> MetaOapg.properties.next_cursor: ...
                
                def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["next_cursor"], ]):
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    next_cursor: typing.Union[MetaOapg.properties.next_cursor, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'response_metadata':
                    return super().__new__(
                        cls,
                        *args,
                        next_cursor=next_cursor,
                        _configuration=_configuration,
                    )
            __annotations__ = {
                "channels": channels,
                "ok": ok,
                "response_metadata": response_metadata,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    channels: MetaOapg.properties.channels
    ok: 'DefsOkTrue'
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["channels"]) -> MetaOapg.properties.channels: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["response_metadata"]) -> MetaOapg.properties.response_metadata: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["channels"], typing_extensions.Literal["ok"], typing_extensions.Literal["response_metadata"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["channels"]) -> MetaOapg.properties.channels: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["response_metadata"]) -> typing.Union[MetaOapg.properties.response_metadata, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["channels"], typing_extensions.Literal["ok"], typing_extensions.Literal["response_metadata"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        channels: typing.Union[MetaOapg.properties.channels, list, tuple, ],
        ok: 'DefsOkTrue',
        response_metadata: typing.Union[MetaOapg.properties.response_metadata, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'SchemaFor200ResponseBodyApplicationJson':
        return super().__new__(
            cls,
            *args,
            channels=channels,
            ok=ok,
            response_metadata=response_metadata,
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
            
            
            class error(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "missing_scope": "MISSING_SCOPE",
                        "not_authed": "NOT_AUTHED",
                        "invalid_auth": "INVALID_AUTH",
                        "account_inactive": "ACCOUNT_INACTIVE",
                        "invalid_arg_name": "INVALID_ARG_NAME",
                        "invalid_array_arg": "INVALID_ARRAY_ARG",
                        "invalid_charset": "INVALID_CHARSET",
                        "invalid_form_data": "INVALID_FORM_DATA",
                        "invalid_post_type": "INVALID_POST_TYPE",
                        "missing_post_type": "MISSING_POST_TYPE",
                        "invalid_json": "INVALID_JSON",
                        "json_not_object": "JSON_NOT_OBJECT",
                        "request_timeout": "REQUEST_TIMEOUT",
                        "upgrade_required": "UPGRADE_REQUIRED",
                    }
                
                @schemas.classproperty
                def MISSING_SCOPE(cls):
                    return cls("missing_scope")
                
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
            needed = schemas.StrSchema
        
            @staticmethod
            def ok() -> typing.Type['DefsOkFalse']:
                return DefsOkFalse
            provided = schemas.StrSchema
            __annotations__ = {
                "callstack": callstack,
                "error": error,
                "needed": needed,
                "ok": ok,
                "provided": provided,
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
    def __getitem__(self, name: typing_extensions.Literal["needed"]) -> MetaOapg.properties.needed: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["provided"]) -> MetaOapg.properties.provided: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["error"], typing_extensions.Literal["ok"], typing_extensions.Literal["callstack"], typing_extensions.Literal["needed"], typing_extensions.Literal["provided"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["error"]) -> MetaOapg.properties.error: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkFalse': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["callstack"]) -> typing.Union[MetaOapg.properties.callstack, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["needed"]) -> typing.Union[MetaOapg.properties.needed, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["provided"]) -> typing.Union[MetaOapg.properties.provided, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["error"], typing_extensions.Literal["ok"], typing_extensions.Literal["callstack"], typing_extensions.Literal["needed"], typing_extensions.Literal["provided"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        error: typing.Union[MetaOapg.properties.error, str, ],
        ok: 'DefsOkFalse',
        callstack: typing.Union[MetaOapg.properties.callstack, str, schemas.Unset] = schemas.unset,
        needed: typing.Union[MetaOapg.properties.needed, str, schemas.Unset] = schemas.unset,
        provided: typing.Union[MetaOapg.properties.provided, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'SchemaFor0ResponseBodyApplicationJson':
        return super().__new__(
            cls,
            *args,
            error=error,
            ok=ok,
            callstack=callstack,
            needed=needed,
            provided=provided,
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
    def _conversations_list_oapg(
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
    def _conversations_list_oapg(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _conversations_list_oapg(
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

    def _conversations_list_oapg(
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
            request_query_exclude_archived,
            request_query_types,
            request_query_limit,
            request_query_cursor,
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


class ConversationsList(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    @typing.overload
    def conversations_list(
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
    def conversations_list(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def conversations_list(
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

    def conversations_list(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._conversations_list_oapg(
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
        return self._conversations_list_oapg(
            query_params=query_params,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )

