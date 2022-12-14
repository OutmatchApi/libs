# Rust API client for api

Outmatch API

For more information, please visit [https://OutmatchAPI.com](https://OutmatchAPI.com)

## Overview

This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: 0.0.45
- Package version: 0.0.45
- Build package: `org.openapitools.codegen.languages.RustClientCodegen`

## Installation

Put the package under your project folder in a directory named `api` and add the following to `Cargo.toml` under `[dependencies]`:

```
api = { path = "./api" }
```

## Documentation for API Endpoints

All URIs are relative to *https://api.outmatchapi.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiAppApi* | [**create_api_app**](docs/ApiAppApi.md#create_api_app) | **POST** /apiApp | Create api app
*ApiAppApi* | [**create_api_app_release**](docs/ApiAppApi.md#create_api_app_release) | **POST** /apiApp/{app_id}/release | Create api app release
*ApiAppApi* | [**create_api_app_release_sdks**](docs/ApiAppApi.md#create_api_app_release_sdks) | **POST** /apiApp/{app_id}/release/{release_version}/sdk | Generate sdks for a relase
*StatusApi* | [**get_status**](docs/StatusApi.md#get_status) | **GET** /status | 
*UserApi* | [**create_user**](docs/UserApi.md#create_user) | **POST** /user | Create user
*UserApi* | [**update_user**](docs/UserApi.md#update_user) | **PUT** /user | Update user


## Documentation For Models

 - [ApiApp](docs/ApiApp.md)
 - [CreateApiAppReleaseSdksRequest](docs/CreateApiAppReleaseSdksRequest.md)
 - [CreateApiAppRequest](docs/CreateApiAppRequest.md)
 - [CreateUserRequest](docs/CreateUserRequest.md)
 - [Error](docs/Error.md)
 - [Language](docs/Language.md)
 - [Logo](docs/Logo.md)
 - [Release](docs/Release.md)
 - [Sdk](docs/Sdk.md)
 - [Spec](docs/Spec.md)
 - [Status](docs/Status.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)
 - [User](docs/User.md)


To get access to the crate's generated documentation, use:

```
cargo doc --open
```

## Author

internal@outmatchapi.com

