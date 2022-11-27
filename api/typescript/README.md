## @gener-api-test/api@0.0.27

### Install

```
npm install @gener-api-test/api@0.0.27 --save

// Or with yarn

yarn add @gener-api-test/api@0.0.27

```

### Building

To build and compile the typescript sources to javascript use:
```
npm install
npm run build

// Or with yarn

yarn
yarn build
```

## Documentation for API Endpoints

All URIs are relative to *https://api.outmatchapi.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiAppApi* | [**createApiApp**](ApiAppApi.md#createapiapp) | **POST** /apiApp | Create api app
*ApiAppApi* | [**createApiAppRelease**](ApiAppApi.md#createapiapprelease) | **POST** /apiApp/{app_id}/release | Create api app release
*ApiAppApi* | [**createApiAppReleaseSdks**](ApiAppApi.md#createapiappreleasesdks) | **POST** /apiApp/{app_id}/release/{release_version}/sdk | Generate sdks for a relase
*StatusApi* | [**getStatus**](StatusApi.md#getstatus) | **GET** /status | 
*UserApi* | [**createUser**](UserApi.md#createuser) | **POST** /user | Create user
*UserApi* | [**updateUser**](UserApi.md#updateuser) | **PUT** /user | Update user

