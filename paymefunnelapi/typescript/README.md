## @apilibraries/paymefunnelapi@0.0.59

### Install

```
npm install @apilibraries/paymefunnelapi@0.0.59 --save

// Or with yarn

yarn add @apilibraries/paymefunnelapi@0.0.59

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

All URIs are relative to *https://www.PayMeFunnel.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FunnelApi* | [**funnelCreate**](FunnelApi.md#funnelcreate) | **POST** /funnel | 
*PublicFunnelApi* | [**getFunnel**](PublicFunnelApi.md#getfunnel) | **GET** /publicfunnel/{funnel_id} | Publicly get funnel
*StatusApi* | [**getStatus**](StatusApi.md#getstatus) | **GET** /status | 
*UserApi* | [**createUser**](UserApi.md#createuser) | **POST** /user | Create user
*UserApi* | [**updateUser**](UserApi.md#updateuser) | **PUT** /user | Update user
*UserApi* | [**userConnectStripe**](UserApi.md#userconnectstripe) | **GET** /user/connectStripe | Update user&#39;s stripe account

