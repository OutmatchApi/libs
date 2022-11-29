import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ApplicationIn } from '../models/ApplicationIn';
import { ApplicationOut } from '../models/ApplicationOut';
import { DashboardAccessOut } from '../models/DashboardAccessOut';
import { EndpointCreatedEvent } from '../models/EndpointCreatedEvent';
import { EndpointCreatedEventData } from '../models/EndpointCreatedEventData';
import { EndpointDeletedEvent } from '../models/EndpointDeletedEvent';
import { EndpointDeletedEventData } from '../models/EndpointDeletedEventData';
import { EndpointDisabledEvent } from '../models/EndpointDisabledEvent';
import { EndpointDisabledEventData } from '../models/EndpointDisabledEventData';
import { EndpointHeadersIn } from '../models/EndpointHeadersIn';
import { EndpointHeadersOut } from '../models/EndpointHeadersOut';
import { EndpointHeadersPatchIn } from '../models/EndpointHeadersPatchIn';
import { EndpointIn } from '../models/EndpointIn';
import { EndpointMessageOut } from '../models/EndpointMessageOut';
import { EndpointOut } from '../models/EndpointOut';
import { EndpointSecretOut } from '../models/EndpointSecretOut';
import { EndpointSecretRotateIn } from '../models/EndpointSecretRotateIn';
import { EndpointStats } from '../models/EndpointStats';
import { EndpointUpdate } from '../models/EndpointUpdate';
import { EndpointUpdatedEvent } from '../models/EndpointUpdatedEvent';
import { EndpointUpdatedEventData } from '../models/EndpointUpdatedEventData';
import { EventTypeIn } from '../models/EventTypeIn';
import { EventTypeOut } from '../models/EventTypeOut';
import { EventTypeUpdate } from '../models/EventTypeUpdate';
import { HTTPValidationError } from '../models/HTTPValidationError';
import { HttpErrorOut } from '../models/HttpErrorOut';
import { IntegrationIn } from '../models/IntegrationIn';
import { IntegrationKeyOut } from '../models/IntegrationKeyOut';
import { IntegrationOut } from '../models/IntegrationOut';
import { IntegrationUpdate } from '../models/IntegrationUpdate';
import { ListResponseApplicationOut } from '../models/ListResponseApplicationOut';
import { ListResponseEndpointMessageOut } from '../models/ListResponseEndpointMessageOut';
import { ListResponseEndpointOut } from '../models/ListResponseEndpointOut';
import { ListResponseEventTypeOut } from '../models/ListResponseEventTypeOut';
import { ListResponseIntegrationOut } from '../models/ListResponseIntegrationOut';
import { ListResponseMessageAttemptEndpointOut } from '../models/ListResponseMessageAttemptEndpointOut';
import { ListResponseMessageAttemptOut } from '../models/ListResponseMessageAttemptOut';
import { ListResponseMessageEndpointOut } from '../models/ListResponseMessageEndpointOut';
import { ListResponseMessageOut } from '../models/ListResponseMessageOut';
import { MessageAttemptEndpointOut } from '../models/MessageAttemptEndpointOut';
import { MessageAttemptExhaustedEvent } from '../models/MessageAttemptExhaustedEvent';
import { MessageAttemptExhaustedEventData } from '../models/MessageAttemptExhaustedEventData';
import { MessageAttemptFailedData } from '../models/MessageAttemptFailedData';
import { MessageAttemptFailingEvent } from '../models/MessageAttemptFailingEvent';
import { MessageAttemptFailingEventData } from '../models/MessageAttemptFailingEventData';
import { MessageAttemptOut } from '../models/MessageAttemptOut';
import { MessageAttemptTriggerType } from '../models/MessageAttemptTriggerType';
import { MessageEndpointOut } from '../models/MessageEndpointOut';
import { MessageIn } from '../models/MessageIn';
import { MessageOut } from '../models/MessageOut';
import { MessageStatus } from '../models/MessageStatus';
import { RecoverIn } from '../models/RecoverIn';
import { ReplayIn } from '../models/ReplayIn';
import { StatusCodeClass } from '../models/StatusCodeClass';
import { ValidationError } from '../models/ValidationError';
import { WebhookTypes } from '../models/WebhookTypes';
import { ObservableApplicationApi } from './ObservableAPI';

import { ApplicationApiRequestFactory, ApplicationApiResponseProcessor} from "../apis/ApplicationApi";
export class PromiseApplicationApi {
    private api: ObservableApplicationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ApplicationApiRequestFactory,
        responseProcessor?: ApplicationApiResponseProcessor
    ) {
        this.api = new ObservableApplicationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a new application.
     * Create Application
     * @param applicationIn 
     * @param getIfExists Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs.
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public createApplicationApiV1AppPost(applicationIn: ApplicationIn, getIfExists?: boolean, idempotencyKey?: string, _options?: Configuration): Promise<ApplicationOut> {
        const result = this.api.createApplicationApiV1AppPost(applicationIn, getIfExists, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Delete an application.
     * Delete Application
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public deleteApplicationApiV1AppAppIdDelete(appId: string, idempotencyKey?: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteApplicationApiV1AppAppIdDelete(appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Get an application.
     * Get Application
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getApplicationApiV1AppAppIdGet(appId: string, idempotencyKey?: string, _options?: Configuration): Promise<ApplicationOut> {
        const result = this.api.getApplicationApiV1AppAppIdGet(appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * List of all the organization's applications.
     * List Applications
     * @param iterator 
     * @param limit 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listApplicationsApiV1AppGet(iterator?: string, limit?: number, idempotencyKey?: string, _options?: Configuration): Promise<ListResponseApplicationOut> {
        const result = this.api.listApplicationsApiV1AppGet(iterator, limit, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Update an application.
     * Update Application
     * @param appId 
     * @param applicationIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public updateApplicationApiV1AppAppIdPut(appId: string, applicationIn: ApplicationIn, idempotencyKey?: string, _options?: Configuration): Promise<ApplicationOut> {
        const result = this.api.updateApplicationApiV1AppAppIdPut(appId, applicationIn, idempotencyKey, _options);
        return result.toPromise();
    }


}



import { ObservableAuthenticationApi } from './ObservableAPI';

import { AuthenticationApiRequestFactory, AuthenticationApiResponseProcessor} from "../apis/AuthenticationApi";
export class PromiseAuthenticationApi {
    private api: ObservableAuthenticationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AuthenticationApiRequestFactory,
        responseProcessor?: AuthenticationApiResponseProcessor
    ) {
        this.api = new ObservableAuthenticationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.
     * Get Consumer App Portal Access
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getDashboardAccessApiV1AuthDashboardAccessAppIdPost(appId: string, idempotencyKey?: string, _options?: Configuration): Promise<DashboardAccessOut> {
        const result = this.api.getDashboardAccessApiV1AuthDashboardAccessAppIdPost(appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Logout an app token.  Trying to log out other tokens will fail.
     * Logout
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public logoutApiV1AuthLogoutPost(idempotencyKey?: string, _options?: Configuration): Promise<void> {
        const result = this.api.logoutApiV1AuthLogoutPost(idempotencyKey, _options);
        return result.toPromise();
    }


}



import { ObservableEndpointApi } from './ObservableAPI';

import { EndpointApiRequestFactory, EndpointApiResponseProcessor} from "../apis/EndpointApi";
export class PromiseEndpointApi {
    private api: ObservableEndpointApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EndpointApiRequestFactory,
        responseProcessor?: EndpointApiResponseProcessor
    ) {
        this.api = new ObservableEndpointApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a new endpoint for the application.  When `secret` is `null` the secret is automatically generated (recommended)
     * Create Endpoint
     * @param appId 
     * @param endpointIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public createEndpointApiV1AppAppIdEndpointPost(appId: string, endpointIn: EndpointIn, idempotencyKey?: string, _options?: Configuration): Promise<EndpointOut> {
        const result = this.api.createEndpointApiV1AppAppIdEndpointPost(appId, endpointIn, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Delete an endpoint.
     * Delete Endpoint
     * @param endpointId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(endpointId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(endpointId, appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Get an application.
     * Get Endpoint
     * @param endpointId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getEndpointApiV1AppAppIdEndpointEndpointIdGet(endpointId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<EndpointOut> {
        const result = this.api.getEndpointApiV1AppAppIdEndpointEndpointIdGet(endpointId, appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Get the additional headers to be sent with the webhook
     * Get Endpoint Headers
     * @param endpointId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(endpointId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<EndpointHeadersOut> {
        const result = this.api.getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(endpointId, appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Get the endpoint's signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).
     * Get Endpoint Secret
     * @param endpointId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(endpointId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<EndpointSecretOut> {
        const result = this.api.getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(endpointId, appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Get basic statistics for the endpoint.
     * Get Endpoint Stats
     * @param endpointId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(endpointId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<EndpointStats> {
        const result = this.api.getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(endpointId, appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * List the application's endpoints.
     * List Endpoints
     * @param appId 
     * @param iterator 
     * @param limit 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listEndpointsApiV1AppAppIdEndpointGet(appId: string, iterator?: string, limit?: number, idempotencyKey?: string, _options?: Configuration): Promise<ListResponseEndpointOut> {
        const result = this.api.listEndpointsApiV1AppAppIdEndpointGet(appId, iterator, limit, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Partially set the additional headers to be sent with the webhook
     * Patch Endpoint Headers
     * @param appId 
     * @param endpointId 
     * @param endpointHeadersPatchIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(appId: string, endpointId: string, endpointHeadersPatchIn: EndpointHeadersPatchIn, idempotencyKey?: string, _options?: Configuration): Promise<void> {
        const result = this.api.patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(appId, endpointId, endpointHeadersPatchIn, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Resend all failed messages since a given time.
     * Recover Failed Webhooks
     * @param appId 
     * @param endpointId 
     * @param recoverIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(appId: string, endpointId: string, recoverIn: RecoverIn, idempotencyKey?: string, _options?: Configuration): Promise<any> {
        const result = this.api.recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(appId, endpointId, recoverIn, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Replays messages to the endpoint. Only messages that were created after `since` will be sent. Messages that were previously sent to the endpoint are not resent.
     * Replay Missing Webhooks
     * @param appId 
     * @param endpointId 
     * @param replayIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(appId: string, endpointId: string, replayIn: ReplayIn, idempotencyKey?: string, _options?: Configuration): Promise<any> {
        const result = this.api.replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(appId, endpointId, replayIn, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Rotates the endpoint's signing secret.  The previous secret will be valid for the next 24 hours.
     * Rotate Endpoint Secret
     * @param endpointId 
     * @param appId 
     * @param endpointSecretRotateIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(endpointId: string, appId: string, endpointSecretRotateIn: EndpointSecretRotateIn, idempotencyKey?: string, _options?: Configuration): Promise<void> {
        const result = this.api.rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(endpointId, appId, endpointSecretRotateIn, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Update an endpoint.
     * Update Endpoint
     * @param endpointId 
     * @param appId 
     * @param endpointUpdate 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public updateEndpointApiV1AppAppIdEndpointEndpointIdPut(endpointId: string, appId: string, endpointUpdate: EndpointUpdate, idempotencyKey?: string, _options?: Configuration): Promise<EndpointOut> {
        const result = this.api.updateEndpointApiV1AppAppIdEndpointEndpointIdPut(endpointId, appId, endpointUpdate, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Set the additional headers to be sent with the webhook
     * Update Endpoint Headers
     * @param appId 
     * @param endpointId 
     * @param endpointHeadersIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(appId: string, endpointId: string, endpointHeadersIn: EndpointHeadersIn, idempotencyKey?: string, _options?: Configuration): Promise<void> {
        const result = this.api.updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(appId, endpointId, endpointHeadersIn, idempotencyKey, _options);
        return result.toPromise();
    }


}



import { ObservableEventTypeApi } from './ObservableAPI';

import { EventTypeApiRequestFactory, EventTypeApiResponseProcessor} from "../apis/EventTypeApi";
export class PromiseEventTypeApi {
    private api: ObservableEventTypeApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EventTypeApiRequestFactory,
        responseProcessor?: EventTypeApiResponseProcessor
    ) {
        this.api = new ObservableEventTypeApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.
     * Create Event Type
     * @param eventTypeIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public createEventTypeApiV1EventTypePost(eventTypeIn: EventTypeIn, idempotencyKey?: string, _options?: Configuration): Promise<EventTypeOut> {
        const result = this.api.createEventTypeApiV1EventTypePost(eventTypeIn, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).
     * Archive Event Type
     * @param eventTypeName 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public deleteEventTypeApiV1EventTypeEventTypeNameDelete(eventTypeName: string, idempotencyKey?: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteEventTypeApiV1EventTypeEventTypeNameDelete(eventTypeName, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Get an event type.
     * Get Event Type
     * @param eventTypeName 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getEventTypeApiV1EventTypeEventTypeNameGet(eventTypeName: string, idempotencyKey?: string, _options?: Configuration): Promise<EventTypeOut> {
        const result = this.api.getEventTypeApiV1EventTypeEventTypeNameGet(eventTypeName, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Return the list of event types.
     * List Event Types
     * @param iterator 
     * @param limit 
     * @param withContent 
     * @param includeArchived 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listEventTypesApiV1EventTypeGet(iterator?: string, limit?: number, withContent?: boolean, includeArchived?: boolean, idempotencyKey?: string, _options?: Configuration): Promise<ListResponseEventTypeOut> {
        const result = this.api.listEventTypesApiV1EventTypeGet(iterator, limit, withContent, includeArchived, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Update an event type.
     * Update Event Type
     * @param eventTypeName 
     * @param eventTypeUpdate 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public updateEventTypeApiV1EventTypeEventTypeNamePut(eventTypeName: string, eventTypeUpdate: EventTypeUpdate, idempotencyKey?: string, _options?: Configuration): Promise<EventTypeOut> {
        const result = this.api.updateEventTypeApiV1EventTypeEventTypeNamePut(eventTypeName, eventTypeUpdate, idempotencyKey, _options);
        return result.toPromise();
    }


}



import { ObservableHealthApi } from './ObservableAPI';

import { HealthApiRequestFactory, HealthApiResponseProcessor} from "../apis/HealthApi";
export class PromiseHealthApi {
    private api: ObservableHealthApi

    public constructor(
        configuration: Configuration,
        requestFactory?: HealthApiRequestFactory,
        responseProcessor?: HealthApiResponseProcessor
    ) {
        this.api = new ObservableHealthApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Verify the API server is up and running.
     * Health
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public healthApiV1HealthGet(idempotencyKey?: string, _options?: Configuration): Promise<void> {
        const result = this.api.healthApiV1HealthGet(idempotencyKey, _options);
        return result.toPromise();
    }


}



import { ObservableIntegrationApi } from './ObservableAPI';

import { IntegrationApiRequestFactory, IntegrationApiResponseProcessor} from "../apis/IntegrationApi";
export class PromiseIntegrationApi {
    private api: ObservableIntegrationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: IntegrationApiRequestFactory,
        responseProcessor?: IntegrationApiResponseProcessor
    ) {
        this.api = new ObservableIntegrationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an integration.
     * Create Integration
     * @param appId 
     * @param integrationIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public createIntegrationApiV1AppAppIdIntegrationPost(appId: string, integrationIn: IntegrationIn, idempotencyKey?: string, _options?: Configuration): Promise<IntegrationOut> {
        const result = this.api.createIntegrationApiV1AppAppIdIntegrationPost(appId, integrationIn, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Delete an integration and revoke it's key.
     * Delete Integration
     * @param integId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(integId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(integId, appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Get an integration.
     * Get Integration
     * @param integId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getIntegrationApiV1AppAppIdIntegrationIntegIdGet(integId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<IntegrationOut> {
        const result = this.api.getIntegrationApiV1AppAppIdIntegrationIntegIdGet(integId, appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Get an integration's key.
     * Get Integration Key
     * @param integId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(integId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<IntegrationKeyOut> {
        const result = this.api.getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(integId, appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * List the application's integrations.
     * List Integrations
     * @param appId 
     * @param iterator 
     * @param limit 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listIntegrationsApiV1AppAppIdIntegrationGet(appId: string, iterator?: string, limit?: number, idempotencyKey?: string, _options?: Configuration): Promise<ListResponseIntegrationOut> {
        const result = this.api.listIntegrationsApiV1AppAppIdIntegrationGet(appId, iterator, limit, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Rotate the integration's key. The previous key will be immediately revoked.
     * Rotate Integration Key
     * @param integId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(integId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<IntegrationKeyOut> {
        const result = this.api.rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(integId, appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Update an integration.
     * Update Integration
     * @param integId 
     * @param appId 
     * @param integrationUpdate 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public updateIntegrationApiV1AppAppIdIntegrationIntegIdPut(integId: string, appId: string, integrationUpdate: IntegrationUpdate, idempotencyKey?: string, _options?: Configuration): Promise<IntegrationOut> {
        const result = this.api.updateIntegrationApiV1AppAppIdIntegrationIntegIdPut(integId, appId, integrationUpdate, idempotencyKey, _options);
        return result.toPromise();
    }


}



import { ObservableMessageApi } from './ObservableAPI';

import { MessageApiRequestFactory, MessageApiResponseProcessor} from "../apis/MessageApi";
export class PromiseMessageApi {
    private api: ObservableMessageApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MessageApiRequestFactory,
        responseProcessor?: MessageApiResponseProcessor
    ) {
        this.api = new ObservableMessageApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates a new message and dispatches it to all of the application's endpoints.  The `eventId` is an optional custom unique ID. It's verified to be unique only up to a day, after that no verification will be made. If a message with the same `eventId` already exists for any application in your environment, a 409 conflict error will be returned.  The `eventType` indicates the type and schema of the event. All messages of a certain `eventType` are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have `channels`, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don't imply a specific message content or schema.  The `payload' property is the webhook's body (the actual webhook message).
     * Create Message
     * @param appId 
     * @param messageIn 
     * @param withContent 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public createMessageApiV1AppAppIdMsgPost(appId: string, messageIn: MessageIn, withContent?: boolean, idempotencyKey?: string, _options?: Configuration): Promise<MessageOut> {
        const result = this.api.createMessageApiV1AppAppIdMsgPost(appId, messageIn, withContent, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Get a message by its ID or eventID.
     * Get Message
     * @param msgId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getMessageApiV1AppAppIdMsgMsgIdGet(msgId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<MessageOut> {
        const result = this.api.getMessageApiV1AppAppIdMsgMsgIdGet(msgId, appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * List all of the application's messages.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed. The `after` parameter lets you filter all items created after a certain date and is ignored if an iterator is passed. `before` and `after` cannot be used simultaneously.
     * List Messages
     * @param appId 
     * @param iterator 
     * @param limit 
     * @param eventTypes 
     * @param channel 
     * @param before 
     * @param after 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listMessagesApiV1AppAppIdMsgGet(appId: string, iterator?: string, limit?: number, eventTypes?: Array<string>, channel?: string, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Promise<ListResponseMessageOut> {
        const result = this.api.listMessagesApiV1AppAppIdMsgGet(appId, iterator, limit, eventTypes, channel, before, after, idempotencyKey, _options);
        return result.toPromise();
    }


}



import { ObservableMessageAttemptApi } from './ObservableAPI';

import { MessageAttemptApiRequestFactory, MessageAttemptApiResponseProcessor} from "../apis/MessageAttemptApi";
export class PromiseMessageAttemptApi {
    private api: ObservableMessageAttemptApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MessageAttemptApiRequestFactory,
        responseProcessor?: MessageAttemptApiResponseProcessor
    ) {
        this.api = new ObservableMessageAttemptApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * `msg_id`: Use a message id or a message `eventId`
     * Get Attempt
     * @param attemptId 
     * @param msgId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(attemptId: string, msgId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<MessageAttemptOut> {
        const result = this.api.getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(attemptId, msgId, appId, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * `msg_id`: Use a message id or a message `eventId`
     * List Attempted Destinations
     * @param msgId 
     * @param appId 
     * @param iterator 
     * @param limit 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(msgId: string, appId: string, iterator?: string, limit?: number, idempotencyKey?: string, _options?: Configuration): Promise<ListResponseMessageEndpointOut> {
        const result = this.api.listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(msgId, appId, iterator, limit, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.
     * List Attempted Messages
     * @param endpointId 
     * @param appId 
     * @param iterator 
     * @param limit 
     * @param channel 
     * @param status 
     * @param before 
     * @param after 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(endpointId: string, appId: string, iterator?: string, limit?: number, channel?: string, status?: MessageStatus, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Promise<ListResponseEndpointMessageOut> {
        const result = this.api.listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(endpointId, appId, iterator, limit, channel, status, before, after, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Deprecated: Please use \"List Attempts by Endpoint\" and \"List Attempts by Msg\" instead.  `msg_id`: Use a message id or a message `eventId`
     * List Attempts
     * @param appId 
     * @param msgId 
     * @param iterator 
     * @param limit 
     * @param endpointId 
     * @param eventTypes 
     * @param channel 
     * @param status 
     * @param before 
     * @param after 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(appId: string, msgId: string, iterator?: string, limit?: number, endpointId?: string, eventTypes?: Array<string>, channel?: string, status?: MessageStatus, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Promise<ListResponseMessageAttemptOut> {
        const result = this.api.listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(appId, msgId, iterator, limit, endpointId, eventTypes, channel, status, before, after, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * List attempts by endpoint id
     * List Attempts By Endpoint
     * @param appId 
     * @param endpointId 
     * @param iterator 
     * @param limit 
     * @param status 
     * @param statusCodeClass 
     * @param eventTypes 
     * @param channel 
     * @param before 
     * @param after 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(appId: string, endpointId: string, iterator?: string, limit?: number, status?: MessageStatus, statusCodeClass?: StatusCodeClass, eventTypes?: Array<string>, channel?: string, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Promise<ListResponseMessageAttemptOut> {
        const result = this.api.listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(appId, endpointId, iterator, limit, status, statusCodeClass, eventTypes, channel, before, after, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * List attempts by message id
     * List Attempts By Msg
     * @param appId 
     * @param msgId 
     * @param endpointId 
     * @param iterator 
     * @param limit 
     * @param status 
     * @param statusCodeClass 
     * @param eventTypes 
     * @param channel 
     * @param before 
     * @param after 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(appId: string, msgId: string, endpointId?: string, iterator?: string, limit?: number, status?: MessageStatus, statusCodeClass?: StatusCodeClass, eventTypes?: Array<string>, channel?: string, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Promise<ListResponseMessageAttemptOut> {
        const result = this.api.listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(appId, msgId, endpointId, iterator, limit, status, statusCodeClass, eventTypes, channel, before, after, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.
     * List Attempts For Endpoint
     * @param msgId 
     * @param appId 
     * @param endpointId 
     * @param iterator 
     * @param limit 
     * @param eventTypes 
     * @param channel 
     * @param status 
     * @param before 
     * @param after 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(msgId: string, appId: string, endpointId: string, iterator?: string, limit?: number, eventTypes?: Array<string>, channel?: string, status?: MessageStatus, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Promise<ListResponseMessageAttemptEndpointOut> {
        const result = this.api.listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(msgId, appId, endpointId, iterator, limit, eventTypes, channel, status, before, after, idempotencyKey, _options);
        return result.toPromise();
    }

    /**
     * Resend a message to the specified endpoint.
     * Resend Webhook
     * @param endpointId 
     * @param msgId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(endpointId: string, msgId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Promise<void> {
        const result = this.api.resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(endpointId, msgId, appId, idempotencyKey, _options);
        return result.toPromise();
    }


}



