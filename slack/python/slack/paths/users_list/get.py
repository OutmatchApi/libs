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

from slack.model.objs_response_metadata import ObjsResponseMetadata
from slack.model.objs_user import ObjsUser
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue

from . import path

# Query params
TokenSchema = schemas.StrSchema
LimitSchema = schemas.IntSchema
CursorSchema = schemas.StrSchema
IncludeLocaleSchema = schemas.BoolSchema
RequestRequiredQueryParams = typing_extensions.TypedDict(
    'RequestRequiredQueryParams',
    {
    }
)
RequestOptionalQueryParams = typing_extensions.TypedDict(
    'RequestOptionalQueryParams',
    {
        'token': typing.Union[TokenSchema, str, ],
        'limit': typing.Union[LimitSchema, decimal.Decimal, int, ],
        'cursor': typing.Union[CursorSchema, str, ],
        'include_locale': typing.Union[IncludeLocaleSchema, bool, ],
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
request_query_include_locale = api_client.QueryParameter(
    name="include_locale",
    style=api_client.ParameterStyle.FORM,
    schema=IncludeLocaleSchema,
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
            "cache_ts",
            "members",
            "ok",
        }
        
        class properties:
            cache_ts = schemas.IntSchema
            
            
            class members(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    unique_items = True
                    min_items = 1
                    
                    @staticmethod
                    def items() -> typing.Type['ObjsUser']:
                        return ObjsUser
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['ObjsUser'], typing.List['ObjsUser']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'members':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'ObjsUser':
                    return super().__getitem__(i)
        
            @staticmethod
            def ok() -> typing.Type['DefsOkTrue']:
                return DefsOkTrue
        
            @staticmethod
            def response_metadata() -> typing.Type['ObjsResponseMetadata']:
                return ObjsResponseMetadata
            __annotations__ = {
                "cache_ts": cache_ts,
                "members": members,
                "ok": ok,
                "response_metadata": response_metadata,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    cache_ts: MetaOapg.properties.cache_ts
    members: MetaOapg.properties.members
    ok: 'DefsOkTrue'
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cache_ts"]) -> MetaOapg.properties.cache_ts: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["members"]) -> MetaOapg.properties.members: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["response_metadata"]) -> 'ObjsResponseMetadata': ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["cache_ts"], typing_extensions.Literal["members"], typing_extensions.Literal["ok"], typing_extensions.Literal["response_metadata"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["cache_ts"]) -> MetaOapg.properties.cache_ts: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["members"]) -> MetaOapg.properties.members: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["response_metadata"]) -> typing.Union['ObjsResponseMetadata', schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["cache_ts"], typing_extensions.Literal["members"], typing_extensions.Literal["ok"], typing_extensions.Literal["response_metadata"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        cache_ts: typing.Union[MetaOapg.properties.cache_ts, decimal.Decimal, int, ],
        members: typing.Union[MetaOapg.properties.members, list, tuple, ],
        ok: 'DefsOkTrue',
        response_metadata: typing.Union['ObjsResponseMetadata', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'SchemaFor200ResponseBodyApplicationJson':
        return super().__new__(
            cls,
            *args,
            cache_ts=cache_ts,
            members=members,
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
                        "limit_required": "LIMIT_REQUIRED",
                        "invalid_cursor": "INVALID_CURSOR",
                        "not_authed": "NOT_AUTHED",
                        "invalid_auth": "INVALID_AUTH",
                        "account_inactive": "ACCOUNT_INACTIVE",
                        "no_permission": "NO_PERMISSION",
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
                def LIMIT_REQUIRED(cls):
                    return cls("limit_required")
                
                @schemas.classproperty
                def INVALID_CURSOR(cls):
                    return cls("invalid_cursor")
                
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
    def _users_list_oapg(
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
    def _users_list_oapg(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _users_list_oapg(
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

    def _users_list_oapg(
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
            request_query_limit,
            request_query_cursor,
            request_query_include_locale,
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


class UsersList(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    @typing.overload
    def users_list(
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
    def users_list(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def users_list(
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

    def users_list(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._users_list_oapg(
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
        return self._users_list_oapg(
            query_params=query_params,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


