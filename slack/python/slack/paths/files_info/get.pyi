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

from slack.model.objs_comments import ObjsComments
from slack.model.objs_paging import ObjsPaging
from slack.model.objs_response_metadata import ObjsResponseMetadata
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.objs_file import ObjsFile
from slack.model.defs_ok_true import DefsOkTrue
from slack.model.defs_user_id import DefsUserId

# Query params
TokenSchema = schemas.StrSchema
FileSchema = schemas.StrSchema
CountSchema = schemas.StrSchema
PageSchema = schemas.StrSchema
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
        'file': typing.Union[FileSchema, str, ],
        'count': typing.Union[CountSchema, str, ],
        'page': typing.Union[PageSchema, str, ],
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
request_query_file = api_client.QueryParameter(
    name="file",
    style=api_client.ParameterStyle.FORM,
    schema=FileSchema,
    explode=True,
)
request_query_count = api_client.QueryParameter(
    name="count",
    style=api_client.ParameterStyle.FORM,
    schema=CountSchema,
    explode=True,
)
request_query_page = api_client.QueryParameter(
    name="page",
    style=api_client.ParameterStyle.FORM,
    schema=PageSchema,
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


class SchemaFor200ResponseBodyApplicationJson(
    schemas.DictSchema
):


    class MetaOapg:
        required = {
            "comments",
            "file",
            "ok",
        }
        
        class properties:
        
            @staticmethod
            def comments() -> typing.Type['ObjsComments']:
                return ObjsComments
            content_html = schemas.AnyTypeSchema
        
            @staticmethod
            def editor() -> typing.Type['DefsUserId']:
                return DefsUserId
        
            @staticmethod
            def file() -> typing.Type['ObjsFile']:
                return ObjsFile
        
            @staticmethod
            def ok() -> typing.Type['DefsOkTrue']:
                return DefsOkTrue
        
            @staticmethod
            def paging() -> typing.Type['ObjsPaging']:
                return ObjsPaging
        
            @staticmethod
            def response_metadata() -> typing.Type['ObjsResponseMetadata']:
                return ObjsResponseMetadata
            __annotations__ = {
                "comments": comments,
                "content_html": content_html,
                "editor": editor,
                "file": file,
                "ok": ok,
                "paging": paging,
                "response_metadata": response_metadata,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    comments: 'ObjsComments'
    file: 'ObjsFile'
    ok: 'DefsOkTrue'
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["comments"]) -> 'ObjsComments': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["file"]) -> 'ObjsFile': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["content_html"]) -> MetaOapg.properties.content_html: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["editor"]) -> 'DefsUserId': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["paging"]) -> 'ObjsPaging': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["response_metadata"]) -> 'ObjsResponseMetadata': ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["comments"], typing_extensions.Literal["file"], typing_extensions.Literal["ok"], typing_extensions.Literal["content_html"], typing_extensions.Literal["editor"], typing_extensions.Literal["paging"], typing_extensions.Literal["response_metadata"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["comments"]) -> 'ObjsComments': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["file"]) -> 'ObjsFile': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ok"]) -> 'DefsOkTrue': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["content_html"]) -> typing.Union[MetaOapg.properties.content_html, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["editor"]) -> typing.Union['DefsUserId', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["paging"]) -> typing.Union['ObjsPaging', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["response_metadata"]) -> typing.Union['ObjsResponseMetadata', schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["comments"], typing_extensions.Literal["file"], typing_extensions.Literal["ok"], typing_extensions.Literal["content_html"], typing_extensions.Literal["editor"], typing_extensions.Literal["paging"], typing_extensions.Literal["response_metadata"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        comments: 'ObjsComments',
        file: 'ObjsFile',
        ok: 'DefsOkTrue',
        content_html: typing.Union[MetaOapg.properties.content_html, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        editor: typing.Union['DefsUserId', schemas.Unset] = schemas.unset,
        paging: typing.Union['ObjsPaging', schemas.Unset] = schemas.unset,
        response_metadata: typing.Union['ObjsResponseMetadata', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'SchemaFor200ResponseBodyApplicationJson':
        return super().__new__(
            cls,
            *args,
            comments=comments,
            file=file,
            ok=ok,
            content_html=content_html,
            editor=editor,
            paging=paging,
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
                
                @schemas.classproperty
                def FILE_NOT_FOUND(cls):
                    return cls("file_not_found")
                
                @schemas.classproperty
                def FILE_DELETED(cls):
                    return cls("file_deleted")
                
                @schemas.classproperty
                def TIMEZONE_COUNT_FAILED(cls):
                    return cls("timezone_count_failed")
                
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
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):
    @typing.overload
    def _files_info_oapg(
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
    def _files_info_oapg(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _files_info_oapg(
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

    def _files_info_oapg(
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
            request_query_file,
            request_query_count,
            request_query_page,
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


class FilesInfo(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    @typing.overload
    def files_info(
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
    def files_info(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def files_info(
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

    def files_info(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._files_info_oapg(
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
        return self._files_info_oapg(
            query_params=query_params,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )

