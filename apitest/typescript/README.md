## @gener-api-test/apitest@1.4.11

### Install

```
npm install @gener-api-test/apitest@1.4.11 --save

// Or with yarn

yarn add @gener-api-test/apitest@1.4.11

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

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationApi* | [**createApplicationApiV1AppPost**](ApplicationApi.md#createapplicationapiv1apppost) | **POST** /api/v1/app/ | Create Application
*ApplicationApi* | [**deleteApplicationApiV1AppAppIdDelete**](ApplicationApi.md#deleteapplicationapiv1appappiddelete) | **DELETE** /api/v1/app/{app_id}/ | Delete Application
*ApplicationApi* | [**getApplicationApiV1AppAppIdGet**](ApplicationApi.md#getapplicationapiv1appappidget) | **GET** /api/v1/app/{app_id}/ | Get Application
*ApplicationApi* | [**listApplicationsApiV1AppGet**](ApplicationApi.md#listapplicationsapiv1appget) | **GET** /api/v1/app/ | List Applications
*ApplicationApi* | [**updateApplicationApiV1AppAppIdPut**](ApplicationApi.md#updateapplicationapiv1appappidput) | **PUT** /api/v1/app/{app_id}/ | Update Application
*AuthenticationApi* | [**getDashboardAccessApiV1AuthDashboardAccessAppIdPost**](AuthenticationApi.md#getdashboardaccessapiv1authdashboardaccessappidpost) | **POST** /api/v1/auth/dashboard-access/{app_id}/ | Get Consumer App Portal Access
*AuthenticationApi* | [**logoutApiV1AuthLogoutPost**](AuthenticationApi.md#logoutapiv1authlogoutpost) | **POST** /api/v1/auth/logout/ | Logout
*EndpointApi* | [**createEndpointApiV1AppAppIdEndpointPost**](EndpointApi.md#createendpointapiv1appappidendpointpost) | **POST** /api/v1/app/{app_id}/endpoint/ | Create Endpoint
*EndpointApi* | [**deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete**](EndpointApi.md#deleteendpointapiv1appappidendpointendpointiddelete) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Delete Endpoint
*EndpointApi* | [**getEndpointApiV1AppAppIdEndpointEndpointIdGet**](EndpointApi.md#getendpointapiv1appappidendpointendpointidget) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Get Endpoint
*EndpointApi* | [**getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet**](EndpointApi.md#getendpointheadersapiv1appappidendpointendpointidheadersget) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Get Endpoint Headers
*EndpointApi* | [**getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet**](EndpointApi.md#getendpointsecretapiv1appappidendpointendpointidsecretget) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/ | Get Endpoint Secret
*EndpointApi* | [**getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet**](EndpointApi.md#getendpointstatsapiv1appappidendpointendpointidstatsget) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats/ | Get Endpoint Stats
*EndpointApi* | [**listEndpointsApiV1AppAppIdEndpointGet**](EndpointApi.md#listendpointsapiv1appappidendpointget) | **GET** /api/v1/app/{app_id}/endpoint/ | List Endpoints
*EndpointApi* | [**patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch**](EndpointApi.md#patchendpointheadersapiv1appappidendpointendpointidheaderspatch) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Patch Endpoint Headers
*EndpointApi* | [**recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost**](EndpointApi.md#recoverfailedwebhooksapiv1appappidendpointendpointidrecoverpost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover/ | Recover Failed Webhooks
*EndpointApi* | [**replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost**](EndpointApi.md#replaymissingwebhooksapiv1appappidendpointendpointidreplaymissingpost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing/ | Replay Missing Webhooks
*EndpointApi* | [**rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost**](EndpointApi.md#rotateendpointsecretapiv1appappidendpointendpointidsecretrotatepost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate/ | Rotate Endpoint Secret
*EndpointApi* | [**updateEndpointApiV1AppAppIdEndpointEndpointIdPut**](EndpointApi.md#updateendpointapiv1appappidendpointendpointidput) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Update Endpoint
*EndpointApi* | [**updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut**](EndpointApi.md#updateendpointheadersapiv1appappidendpointendpointidheadersput) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Update Endpoint Headers
*EventTypeApi* | [**createEventTypeApiV1EventTypePost**](EventTypeApi.md#createeventtypeapiv1eventtypepost) | **POST** /api/v1/event-type/ | Create Event Type
*EventTypeApi* | [**deleteEventTypeApiV1EventTypeEventTypeNameDelete**](EventTypeApi.md#deleteeventtypeapiv1eventtypeeventtypenamedelete) | **DELETE** /api/v1/event-type/{event_type_name}/ | Archive Event Type
*EventTypeApi* | [**getEventTypeApiV1EventTypeEventTypeNameGet**](EventTypeApi.md#geteventtypeapiv1eventtypeeventtypenameget) | **GET** /api/v1/event-type/{event_type_name}/ | Get Event Type
*EventTypeApi* | [**listEventTypesApiV1EventTypeGet**](EventTypeApi.md#listeventtypesapiv1eventtypeget) | **GET** /api/v1/event-type/ | List Event Types
*EventTypeApi* | [**updateEventTypeApiV1EventTypeEventTypeNamePut**](EventTypeApi.md#updateeventtypeapiv1eventtypeeventtypenameput) | **PUT** /api/v1/event-type/{event_type_name}/ | Update Event Type
*HealthApi* | [**healthApiV1HealthGet**](HealthApi.md#healthapiv1healthget) | **GET** /api/v1/health/ | Health
*IntegrationApi* | [**createIntegrationApiV1AppAppIdIntegrationPost**](IntegrationApi.md#createintegrationapiv1appappidintegrationpost) | **POST** /api/v1/app/{app_id}/integration/ | Create Integration
*IntegrationApi* | [**deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete**](IntegrationApi.md#deleteintegrationapiv1appappidintegrationintegiddelete) | **DELETE** /api/v1/app/{app_id}/integration/{integ_id}/ | Delete Integration
*IntegrationApi* | [**getIntegrationApiV1AppAppIdIntegrationIntegIdGet**](IntegrationApi.md#getintegrationapiv1appappidintegrationintegidget) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/ | Get Integration
*IntegrationApi* | [**getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet**](IntegrationApi.md#getintegrationkeyapiv1appappidintegrationintegidkeyget) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/key/ | Get Integration Key
*IntegrationApi* | [**listIntegrationsApiV1AppAppIdIntegrationGet**](IntegrationApi.md#listintegrationsapiv1appappidintegrationget) | **GET** /api/v1/app/{app_id}/integration/ | List Integrations
*IntegrationApi* | [**rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost**](IntegrationApi.md#rotateintegrationkeyapiv1appappidintegrationintegidkeyrotatepost) | **POST** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate/ | Rotate Integration Key
*IntegrationApi* | [**updateIntegrationApiV1AppAppIdIntegrationIntegIdPut**](IntegrationApi.md#updateintegrationapiv1appappidintegrationintegidput) | **PUT** /api/v1/app/{app_id}/integration/{integ_id}/ | Update Integration
*MessageApi* | [**createMessageApiV1AppAppIdMsgPost**](MessageApi.md#createmessageapiv1appappidmsgpost) | **POST** /api/v1/app/{app_id}/msg/ | Create Message
*MessageApi* | [**getMessageApiV1AppAppIdMsgMsgIdGet**](MessageApi.md#getmessageapiv1appappidmsgmsgidget) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/ | Get Message
*MessageApi* | [**listMessagesApiV1AppAppIdMsgGet**](MessageApi.md#listmessagesapiv1appappidmsgget) | **GET** /api/v1/app/{app_id}/msg/ | List Messages
*MessageAttemptApi* | [**getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet**](MessageAttemptApi.md#getattemptapiv1appappidmsgmsgidattemptattemptidget) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/ | Get Attempt
*MessageAttemptApi* | [**listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet**](MessageAttemptApi.md#listattempteddestinationsapiv1appappidmsgmsgidendpointget) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/ | List Attempted Destinations
*MessageAttemptApi* | [**listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet**](MessageAttemptApi.md#listattemptedmessagesapiv1appappidendpointendpointidmsgget) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/ | List Attempted Messages
*MessageAttemptApi* | [**listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet**](MessageAttemptApi.md#listattemptsapiv1appappidmsgmsgidattemptget) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/ | List Attempts
*MessageAttemptApi* | [**listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet**](MessageAttemptApi.md#listattemptsbyendpointapiv1appappidattemptendpointendpointidget) | **GET** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id}/ | List Attempts By Endpoint
*MessageAttemptApi* | [**listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet**](MessageAttemptApi.md#listattemptsbymsgapiv1appappidattemptmsgmsgidget) | **GET** /api/v1/app/{app_id}/attempt/msg/{msg_id}/ | List Attempts By Msg
*MessageAttemptApi* | [**listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet**](MessageAttemptApi.md#listattemptsforendpointapiv1appappidmsgmsgidendpointendpointidattemptget) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt/ | List Attempts For Endpoint
*MessageAttemptApi* | [**resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost**](MessageAttemptApi.md#resendwebhookapiv1appappidmsgmsgidendpointendpointidresendpost) | **POST** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend/ | Resend Webhook

