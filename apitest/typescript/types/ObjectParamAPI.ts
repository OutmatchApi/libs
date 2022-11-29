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

import { ObservableApplicationApi } from "./ObservableAPI";
import { ApplicationApiRequestFactory, ApplicationApiResponseProcessor} from "../apis/ApplicationApi";

export interface ApplicationApiCreateApplicationApiV1AppPostRequest {
    /**
     * 
     * @type ApplicationIn
     * @memberof ApplicationApicreateApplicationApiV1AppPost
     */
    applicationIn: ApplicationIn
    /**
     * Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs.
     * @type boolean
     * @memberof ApplicationApicreateApplicationApiV1AppPost
     */
    getIfExists?: boolean
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof ApplicationApicreateApplicationApiV1AppPost
     */
    idempotencyKey?: string
}

export interface ApplicationApiDeleteApplicationApiV1AppAppIdDeleteRequest {
    /**
     * 
     * @type string
     * @memberof ApplicationApideleteApplicationApiV1AppAppIdDelete
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof ApplicationApideleteApplicationApiV1AppAppIdDelete
     */
    idempotencyKey?: string
}

export interface ApplicationApiGetApplicationApiV1AppAppIdGetRequest {
    /**
     * 
     * @type string
     * @memberof ApplicationApigetApplicationApiV1AppAppIdGet
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof ApplicationApigetApplicationApiV1AppAppIdGet
     */
    idempotencyKey?: string
}

export interface ApplicationApiListApplicationsApiV1AppGetRequest {
    /**
     * 
     * @type string
     * @memberof ApplicationApilistApplicationsApiV1AppGet
     */
    iterator?: string
    /**
     * 
     * @type number
     * @memberof ApplicationApilistApplicationsApiV1AppGet
     */
    limit?: number
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof ApplicationApilistApplicationsApiV1AppGet
     */
    idempotencyKey?: string
}

export interface ApplicationApiUpdateApplicationApiV1AppAppIdPutRequest {
    /**
     * 
     * @type string
     * @memberof ApplicationApiupdateApplicationApiV1AppAppIdPut
     */
    appId: string
    /**
     * 
     * @type ApplicationIn
     * @memberof ApplicationApiupdateApplicationApiV1AppAppIdPut
     */
    applicationIn: ApplicationIn
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof ApplicationApiupdateApplicationApiV1AppAppIdPut
     */
    idempotencyKey?: string
}

export class ObjectApplicationApi {
    private api: ObservableApplicationApi

    public constructor(configuration: Configuration, requestFactory?: ApplicationApiRequestFactory, responseProcessor?: ApplicationApiResponseProcessor) {
        this.api = new ObservableApplicationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a new application.
     * Create Application
     * @param param the request object
     */
    public createApplicationApiV1AppPost(param: ApplicationApiCreateApplicationApiV1AppPostRequest, options?: Configuration): Promise<ApplicationOut> {
        return this.api.createApplicationApiV1AppPost(param.applicationIn, param.getIfExists, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Delete an application.
     * Delete Application
     * @param param the request object
     */
    public deleteApplicationApiV1AppAppIdDelete(param: ApplicationApiDeleteApplicationApiV1AppAppIdDeleteRequest, options?: Configuration): Promise<void> {
        return this.api.deleteApplicationApiV1AppAppIdDelete(param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Get an application.
     * Get Application
     * @param param the request object
     */
    public getApplicationApiV1AppAppIdGet(param: ApplicationApiGetApplicationApiV1AppAppIdGetRequest, options?: Configuration): Promise<ApplicationOut> {
        return this.api.getApplicationApiV1AppAppIdGet(param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * List of all the organization's applications.
     * List Applications
     * @param param the request object
     */
    public listApplicationsApiV1AppGet(param: ApplicationApiListApplicationsApiV1AppGetRequest = {}, options?: Configuration): Promise<ListResponseApplicationOut> {
        return this.api.listApplicationsApiV1AppGet(param.iterator, param.limit, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Update an application.
     * Update Application
     * @param param the request object
     */
    public updateApplicationApiV1AppAppIdPut(param: ApplicationApiUpdateApplicationApiV1AppAppIdPutRequest, options?: Configuration): Promise<ApplicationOut> {
        return this.api.updateApplicationApiV1AppAppIdPut(param.appId, param.applicationIn, param.idempotencyKey,  options).toPromise();
    }

}

import { ObservableAuthenticationApi } from "./ObservableAPI";
import { AuthenticationApiRequestFactory, AuthenticationApiResponseProcessor} from "../apis/AuthenticationApi";

export interface AuthenticationApiGetDashboardAccessApiV1AuthDashboardAccessAppIdPostRequest {
    /**
     * 
     * @type string
     * @memberof AuthenticationApigetDashboardAccessApiV1AuthDashboardAccessAppIdPost
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof AuthenticationApigetDashboardAccessApiV1AuthDashboardAccessAppIdPost
     */
    idempotencyKey?: string
}

export interface AuthenticationApiLogoutApiV1AuthLogoutPostRequest {
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof AuthenticationApilogoutApiV1AuthLogoutPost
     */
    idempotencyKey?: string
}

export class ObjectAuthenticationApi {
    private api: ObservableAuthenticationApi

    public constructor(configuration: Configuration, requestFactory?: AuthenticationApiRequestFactory, responseProcessor?: AuthenticationApiResponseProcessor) {
        this.api = new ObservableAuthenticationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.
     * Get Consumer App Portal Access
     * @param param the request object
     */
    public getDashboardAccessApiV1AuthDashboardAccessAppIdPost(param: AuthenticationApiGetDashboardAccessApiV1AuthDashboardAccessAppIdPostRequest, options?: Configuration): Promise<DashboardAccessOut> {
        return this.api.getDashboardAccessApiV1AuthDashboardAccessAppIdPost(param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Logout an app token.  Trying to log out other tokens will fail.
     * Logout
     * @param param the request object
     */
    public logoutApiV1AuthLogoutPost(param: AuthenticationApiLogoutApiV1AuthLogoutPostRequest = {}, options?: Configuration): Promise<void> {
        return this.api.logoutApiV1AuthLogoutPost(param.idempotencyKey,  options).toPromise();
    }

}

import { ObservableEndpointApi } from "./ObservableAPI";
import { EndpointApiRequestFactory, EndpointApiResponseProcessor} from "../apis/EndpointApi";

export interface EndpointApiCreateEndpointApiV1AppAppIdEndpointPostRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApicreateEndpointApiV1AppAppIdEndpointPost
     */
    appId: string
    /**
     * 
     * @type EndpointIn
     * @memberof EndpointApicreateEndpointApiV1AppAppIdEndpointPost
     */
    endpointIn: EndpointIn
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApicreateEndpointApiV1AppAppIdEndpointPost
     */
    idempotencyKey?: string
}

export interface EndpointApiDeleteEndpointApiV1AppAppIdEndpointEndpointIdDeleteRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApideleteEndpointApiV1AppAppIdEndpointEndpointIdDelete
     */
    endpointId: string
    /**
     * 
     * @type string
     * @memberof EndpointApideleteEndpointApiV1AppAppIdEndpointEndpointIdDelete
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApideleteEndpointApiV1AppAppIdEndpointEndpointIdDelete
     */
    idempotencyKey?: string
}

export interface EndpointApiGetEndpointApiV1AppAppIdEndpointEndpointIdGetRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApigetEndpointApiV1AppAppIdEndpointEndpointIdGet
     */
    endpointId: string
    /**
     * 
     * @type string
     * @memberof EndpointApigetEndpointApiV1AppAppIdEndpointEndpointIdGet
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApigetEndpointApiV1AppAppIdEndpointEndpointIdGet
     */
    idempotencyKey?: string
}

export interface EndpointApiGetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGetRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApigetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet
     */
    endpointId: string
    /**
     * 
     * @type string
     * @memberof EndpointApigetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApigetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet
     */
    idempotencyKey?: string
}

export interface EndpointApiGetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGetRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApigetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet
     */
    endpointId: string
    /**
     * 
     * @type string
     * @memberof EndpointApigetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApigetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet
     */
    idempotencyKey?: string
}

export interface EndpointApiGetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGetRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApigetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet
     */
    endpointId: string
    /**
     * 
     * @type string
     * @memberof EndpointApigetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApigetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet
     */
    idempotencyKey?: string
}

export interface EndpointApiListEndpointsApiV1AppAppIdEndpointGetRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApilistEndpointsApiV1AppAppIdEndpointGet
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof EndpointApilistEndpointsApiV1AppAppIdEndpointGet
     */
    iterator?: string
    /**
     * 
     * @type number
     * @memberof EndpointApilistEndpointsApiV1AppAppIdEndpointGet
     */
    limit?: number
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApilistEndpointsApiV1AppAppIdEndpointGet
     */
    idempotencyKey?: string
}

export interface EndpointApiPatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatchRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApipatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof EndpointApipatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch
     */
    endpointId: string
    /**
     * 
     * @type EndpointHeadersPatchIn
     * @memberof EndpointApipatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch
     */
    endpointHeadersPatchIn: EndpointHeadersPatchIn
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApipatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch
     */
    idempotencyKey?: string
}

export interface EndpointApiRecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPostRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApirecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof EndpointApirecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost
     */
    endpointId: string
    /**
     * 
     * @type RecoverIn
     * @memberof EndpointApirecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost
     */
    recoverIn: RecoverIn
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApirecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost
     */
    idempotencyKey?: string
}

export interface EndpointApiReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPostRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApireplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof EndpointApireplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost
     */
    endpointId: string
    /**
     * 
     * @type ReplayIn
     * @memberof EndpointApireplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost
     */
    replayIn: ReplayIn
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApireplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost
     */
    idempotencyKey?: string
}

export interface EndpointApiRotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePostRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApirotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost
     */
    endpointId: string
    /**
     * 
     * @type string
     * @memberof EndpointApirotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost
     */
    appId: string
    /**
     * 
     * @type EndpointSecretRotateIn
     * @memberof EndpointApirotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost
     */
    endpointSecretRotateIn: EndpointSecretRotateIn
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApirotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost
     */
    idempotencyKey?: string
}

export interface EndpointApiUpdateEndpointApiV1AppAppIdEndpointEndpointIdPutRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApiupdateEndpointApiV1AppAppIdEndpointEndpointIdPut
     */
    endpointId: string
    /**
     * 
     * @type string
     * @memberof EndpointApiupdateEndpointApiV1AppAppIdEndpointEndpointIdPut
     */
    appId: string
    /**
     * 
     * @type EndpointUpdate
     * @memberof EndpointApiupdateEndpointApiV1AppAppIdEndpointEndpointIdPut
     */
    endpointUpdate: EndpointUpdate
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApiupdateEndpointApiV1AppAppIdEndpointEndpointIdPut
     */
    idempotencyKey?: string
}

export interface EndpointApiUpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPutRequest {
    /**
     * 
     * @type string
     * @memberof EndpointApiupdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof EndpointApiupdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut
     */
    endpointId: string
    /**
     * 
     * @type EndpointHeadersIn
     * @memberof EndpointApiupdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut
     */
    endpointHeadersIn: EndpointHeadersIn
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EndpointApiupdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut
     */
    idempotencyKey?: string
}

export class ObjectEndpointApi {
    private api: ObservableEndpointApi

    public constructor(configuration: Configuration, requestFactory?: EndpointApiRequestFactory, responseProcessor?: EndpointApiResponseProcessor) {
        this.api = new ObservableEndpointApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a new endpoint for the application.  When `secret` is `null` the secret is automatically generated (recommended)
     * Create Endpoint
     * @param param the request object
     */
    public createEndpointApiV1AppAppIdEndpointPost(param: EndpointApiCreateEndpointApiV1AppAppIdEndpointPostRequest, options?: Configuration): Promise<EndpointOut> {
        return this.api.createEndpointApiV1AppAppIdEndpointPost(param.appId, param.endpointIn, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Delete an endpoint.
     * Delete Endpoint
     * @param param the request object
     */
    public deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(param: EndpointApiDeleteEndpointApiV1AppAppIdEndpointEndpointIdDeleteRequest, options?: Configuration): Promise<void> {
        return this.api.deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(param.endpointId, param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Get an application.
     * Get Endpoint
     * @param param the request object
     */
    public getEndpointApiV1AppAppIdEndpointEndpointIdGet(param: EndpointApiGetEndpointApiV1AppAppIdEndpointEndpointIdGetRequest, options?: Configuration): Promise<EndpointOut> {
        return this.api.getEndpointApiV1AppAppIdEndpointEndpointIdGet(param.endpointId, param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Get the additional headers to be sent with the webhook
     * Get Endpoint Headers
     * @param param the request object
     */
    public getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(param: EndpointApiGetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGetRequest, options?: Configuration): Promise<EndpointHeadersOut> {
        return this.api.getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(param.endpointId, param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Get the endpoint's signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).
     * Get Endpoint Secret
     * @param param the request object
     */
    public getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(param: EndpointApiGetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGetRequest, options?: Configuration): Promise<EndpointSecretOut> {
        return this.api.getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(param.endpointId, param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Get basic statistics for the endpoint.
     * Get Endpoint Stats
     * @param param the request object
     */
    public getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(param: EndpointApiGetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGetRequest, options?: Configuration): Promise<EndpointStats> {
        return this.api.getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(param.endpointId, param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * List the application's endpoints.
     * List Endpoints
     * @param param the request object
     */
    public listEndpointsApiV1AppAppIdEndpointGet(param: EndpointApiListEndpointsApiV1AppAppIdEndpointGetRequest, options?: Configuration): Promise<ListResponseEndpointOut> {
        return this.api.listEndpointsApiV1AppAppIdEndpointGet(param.appId, param.iterator, param.limit, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Partially set the additional headers to be sent with the webhook
     * Patch Endpoint Headers
     * @param param the request object
     */
    public patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(param: EndpointApiPatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatchRequest, options?: Configuration): Promise<void> {
        return this.api.patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(param.appId, param.endpointId, param.endpointHeadersPatchIn, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Resend all failed messages since a given time.
     * Recover Failed Webhooks
     * @param param the request object
     */
    public recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(param: EndpointApiRecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPostRequest, options?: Configuration): Promise<any> {
        return this.api.recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(param.appId, param.endpointId, param.recoverIn, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Replays messages to the endpoint. Only messages that were created after `since` will be sent. Messages that were previously sent to the endpoint are not resent.
     * Replay Missing Webhooks
     * @param param the request object
     */
    public replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(param: EndpointApiReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPostRequest, options?: Configuration): Promise<any> {
        return this.api.replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(param.appId, param.endpointId, param.replayIn, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Rotates the endpoint's signing secret.  The previous secret will be valid for the next 24 hours.
     * Rotate Endpoint Secret
     * @param param the request object
     */
    public rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(param: EndpointApiRotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePostRequest, options?: Configuration): Promise<void> {
        return this.api.rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(param.endpointId, param.appId, param.endpointSecretRotateIn, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Update an endpoint.
     * Update Endpoint
     * @param param the request object
     */
    public updateEndpointApiV1AppAppIdEndpointEndpointIdPut(param: EndpointApiUpdateEndpointApiV1AppAppIdEndpointEndpointIdPutRequest, options?: Configuration): Promise<EndpointOut> {
        return this.api.updateEndpointApiV1AppAppIdEndpointEndpointIdPut(param.endpointId, param.appId, param.endpointUpdate, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Set the additional headers to be sent with the webhook
     * Update Endpoint Headers
     * @param param the request object
     */
    public updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(param: EndpointApiUpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPutRequest, options?: Configuration): Promise<void> {
        return this.api.updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(param.appId, param.endpointId, param.endpointHeadersIn, param.idempotencyKey,  options).toPromise();
    }

}

import { ObservableEventTypeApi } from "./ObservableAPI";
import { EventTypeApiRequestFactory, EventTypeApiResponseProcessor} from "../apis/EventTypeApi";

export interface EventTypeApiCreateEventTypeApiV1EventTypePostRequest {
    /**
     * 
     * @type EventTypeIn
     * @memberof EventTypeApicreateEventTypeApiV1EventTypePost
     */
    eventTypeIn: EventTypeIn
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EventTypeApicreateEventTypeApiV1EventTypePost
     */
    idempotencyKey?: string
}

export interface EventTypeApiDeleteEventTypeApiV1EventTypeEventTypeNameDeleteRequest {
    /**
     * 
     * @type string
     * @memberof EventTypeApideleteEventTypeApiV1EventTypeEventTypeNameDelete
     */
    eventTypeName: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EventTypeApideleteEventTypeApiV1EventTypeEventTypeNameDelete
     */
    idempotencyKey?: string
}

export interface EventTypeApiGetEventTypeApiV1EventTypeEventTypeNameGetRequest {
    /**
     * 
     * @type string
     * @memberof EventTypeApigetEventTypeApiV1EventTypeEventTypeNameGet
     */
    eventTypeName: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EventTypeApigetEventTypeApiV1EventTypeEventTypeNameGet
     */
    idempotencyKey?: string
}

export interface EventTypeApiListEventTypesApiV1EventTypeGetRequest {
    /**
     * 
     * @type string
     * @memberof EventTypeApilistEventTypesApiV1EventTypeGet
     */
    iterator?: string
    /**
     * 
     * @type number
     * @memberof EventTypeApilistEventTypesApiV1EventTypeGet
     */
    limit?: number
    /**
     * 
     * @type boolean
     * @memberof EventTypeApilistEventTypesApiV1EventTypeGet
     */
    withContent?: boolean
    /**
     * 
     * @type boolean
     * @memberof EventTypeApilistEventTypesApiV1EventTypeGet
     */
    includeArchived?: boolean
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EventTypeApilistEventTypesApiV1EventTypeGet
     */
    idempotencyKey?: string
}

export interface EventTypeApiUpdateEventTypeApiV1EventTypeEventTypeNamePutRequest {
    /**
     * 
     * @type string
     * @memberof EventTypeApiupdateEventTypeApiV1EventTypeEventTypeNamePut
     */
    eventTypeName: string
    /**
     * 
     * @type EventTypeUpdate
     * @memberof EventTypeApiupdateEventTypeApiV1EventTypeEventTypeNamePut
     */
    eventTypeUpdate: EventTypeUpdate
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof EventTypeApiupdateEventTypeApiV1EventTypeEventTypeNamePut
     */
    idempotencyKey?: string
}

export class ObjectEventTypeApi {
    private api: ObservableEventTypeApi

    public constructor(configuration: Configuration, requestFactory?: EventTypeApiRequestFactory, responseProcessor?: EventTypeApiResponseProcessor) {
        this.api = new ObservableEventTypeApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.
     * Create Event Type
     * @param param the request object
     */
    public createEventTypeApiV1EventTypePost(param: EventTypeApiCreateEventTypeApiV1EventTypePostRequest, options?: Configuration): Promise<EventTypeOut> {
        return this.api.createEventTypeApiV1EventTypePost(param.eventTypeIn, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).
     * Archive Event Type
     * @param param the request object
     */
    public deleteEventTypeApiV1EventTypeEventTypeNameDelete(param: EventTypeApiDeleteEventTypeApiV1EventTypeEventTypeNameDeleteRequest, options?: Configuration): Promise<void> {
        return this.api.deleteEventTypeApiV1EventTypeEventTypeNameDelete(param.eventTypeName, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Get an event type.
     * Get Event Type
     * @param param the request object
     */
    public getEventTypeApiV1EventTypeEventTypeNameGet(param: EventTypeApiGetEventTypeApiV1EventTypeEventTypeNameGetRequest, options?: Configuration): Promise<EventTypeOut> {
        return this.api.getEventTypeApiV1EventTypeEventTypeNameGet(param.eventTypeName, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Return the list of event types.
     * List Event Types
     * @param param the request object
     */
    public listEventTypesApiV1EventTypeGet(param: EventTypeApiListEventTypesApiV1EventTypeGetRequest = {}, options?: Configuration): Promise<ListResponseEventTypeOut> {
        return this.api.listEventTypesApiV1EventTypeGet(param.iterator, param.limit, param.withContent, param.includeArchived, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Update an event type.
     * Update Event Type
     * @param param the request object
     */
    public updateEventTypeApiV1EventTypeEventTypeNamePut(param: EventTypeApiUpdateEventTypeApiV1EventTypeEventTypeNamePutRequest, options?: Configuration): Promise<EventTypeOut> {
        return this.api.updateEventTypeApiV1EventTypeEventTypeNamePut(param.eventTypeName, param.eventTypeUpdate, param.idempotencyKey,  options).toPromise();
    }

}

import { ObservableHealthApi } from "./ObservableAPI";
import { HealthApiRequestFactory, HealthApiResponseProcessor} from "../apis/HealthApi";

export interface HealthApiHealthApiV1HealthGetRequest {
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof HealthApihealthApiV1HealthGet
     */
    idempotencyKey?: string
}

export class ObjectHealthApi {
    private api: ObservableHealthApi

    public constructor(configuration: Configuration, requestFactory?: HealthApiRequestFactory, responseProcessor?: HealthApiResponseProcessor) {
        this.api = new ObservableHealthApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Verify the API server is up and running.
     * Health
     * @param param the request object
     */
    public healthApiV1HealthGet(param: HealthApiHealthApiV1HealthGetRequest = {}, options?: Configuration): Promise<void> {
        return this.api.healthApiV1HealthGet(param.idempotencyKey,  options).toPromise();
    }

}

import { ObservableIntegrationApi } from "./ObservableAPI";
import { IntegrationApiRequestFactory, IntegrationApiResponseProcessor} from "../apis/IntegrationApi";

export interface IntegrationApiCreateIntegrationApiV1AppAppIdIntegrationPostRequest {
    /**
     * 
     * @type string
     * @memberof IntegrationApicreateIntegrationApiV1AppAppIdIntegrationPost
     */
    appId: string
    /**
     * 
     * @type IntegrationIn
     * @memberof IntegrationApicreateIntegrationApiV1AppAppIdIntegrationPost
     */
    integrationIn: IntegrationIn
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof IntegrationApicreateIntegrationApiV1AppAppIdIntegrationPost
     */
    idempotencyKey?: string
}

export interface IntegrationApiDeleteIntegrationApiV1AppAppIdIntegrationIntegIdDeleteRequest {
    /**
     * 
     * @type string
     * @memberof IntegrationApideleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete
     */
    integId: string
    /**
     * 
     * @type string
     * @memberof IntegrationApideleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof IntegrationApideleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete
     */
    idempotencyKey?: string
}

export interface IntegrationApiGetIntegrationApiV1AppAppIdIntegrationIntegIdGetRequest {
    /**
     * 
     * @type string
     * @memberof IntegrationApigetIntegrationApiV1AppAppIdIntegrationIntegIdGet
     */
    integId: string
    /**
     * 
     * @type string
     * @memberof IntegrationApigetIntegrationApiV1AppAppIdIntegrationIntegIdGet
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof IntegrationApigetIntegrationApiV1AppAppIdIntegrationIntegIdGet
     */
    idempotencyKey?: string
}

export interface IntegrationApiGetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGetRequest {
    /**
     * 
     * @type string
     * @memberof IntegrationApigetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet
     */
    integId: string
    /**
     * 
     * @type string
     * @memberof IntegrationApigetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof IntegrationApigetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet
     */
    idempotencyKey?: string
}

export interface IntegrationApiListIntegrationsApiV1AppAppIdIntegrationGetRequest {
    /**
     * 
     * @type string
     * @memberof IntegrationApilistIntegrationsApiV1AppAppIdIntegrationGet
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof IntegrationApilistIntegrationsApiV1AppAppIdIntegrationGet
     */
    iterator?: string
    /**
     * 
     * @type number
     * @memberof IntegrationApilistIntegrationsApiV1AppAppIdIntegrationGet
     */
    limit?: number
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof IntegrationApilistIntegrationsApiV1AppAppIdIntegrationGet
     */
    idempotencyKey?: string
}

export interface IntegrationApiRotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePostRequest {
    /**
     * 
     * @type string
     * @memberof IntegrationApirotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost
     */
    integId: string
    /**
     * 
     * @type string
     * @memberof IntegrationApirotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof IntegrationApirotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost
     */
    idempotencyKey?: string
}

export interface IntegrationApiUpdateIntegrationApiV1AppAppIdIntegrationIntegIdPutRequest {
    /**
     * 
     * @type string
     * @memberof IntegrationApiupdateIntegrationApiV1AppAppIdIntegrationIntegIdPut
     */
    integId: string
    /**
     * 
     * @type string
     * @memberof IntegrationApiupdateIntegrationApiV1AppAppIdIntegrationIntegIdPut
     */
    appId: string
    /**
     * 
     * @type IntegrationUpdate
     * @memberof IntegrationApiupdateIntegrationApiV1AppAppIdIntegrationIntegIdPut
     */
    integrationUpdate: IntegrationUpdate
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof IntegrationApiupdateIntegrationApiV1AppAppIdIntegrationIntegIdPut
     */
    idempotencyKey?: string
}

export class ObjectIntegrationApi {
    private api: ObservableIntegrationApi

    public constructor(configuration: Configuration, requestFactory?: IntegrationApiRequestFactory, responseProcessor?: IntegrationApiResponseProcessor) {
        this.api = new ObservableIntegrationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an integration.
     * Create Integration
     * @param param the request object
     */
    public createIntegrationApiV1AppAppIdIntegrationPost(param: IntegrationApiCreateIntegrationApiV1AppAppIdIntegrationPostRequest, options?: Configuration): Promise<IntegrationOut> {
        return this.api.createIntegrationApiV1AppAppIdIntegrationPost(param.appId, param.integrationIn, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Delete an integration and revoke it's key.
     * Delete Integration
     * @param param the request object
     */
    public deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(param: IntegrationApiDeleteIntegrationApiV1AppAppIdIntegrationIntegIdDeleteRequest, options?: Configuration): Promise<void> {
        return this.api.deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(param.integId, param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Get an integration.
     * Get Integration
     * @param param the request object
     */
    public getIntegrationApiV1AppAppIdIntegrationIntegIdGet(param: IntegrationApiGetIntegrationApiV1AppAppIdIntegrationIntegIdGetRequest, options?: Configuration): Promise<IntegrationOut> {
        return this.api.getIntegrationApiV1AppAppIdIntegrationIntegIdGet(param.integId, param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Get an integration's key.
     * Get Integration Key
     * @param param the request object
     */
    public getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(param: IntegrationApiGetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGetRequest, options?: Configuration): Promise<IntegrationKeyOut> {
        return this.api.getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(param.integId, param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * List the application's integrations.
     * List Integrations
     * @param param the request object
     */
    public listIntegrationsApiV1AppAppIdIntegrationGet(param: IntegrationApiListIntegrationsApiV1AppAppIdIntegrationGetRequest, options?: Configuration): Promise<ListResponseIntegrationOut> {
        return this.api.listIntegrationsApiV1AppAppIdIntegrationGet(param.appId, param.iterator, param.limit, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Rotate the integration's key. The previous key will be immediately revoked.
     * Rotate Integration Key
     * @param param the request object
     */
    public rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(param: IntegrationApiRotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePostRequest, options?: Configuration): Promise<IntegrationKeyOut> {
        return this.api.rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(param.integId, param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Update an integration.
     * Update Integration
     * @param param the request object
     */
    public updateIntegrationApiV1AppAppIdIntegrationIntegIdPut(param: IntegrationApiUpdateIntegrationApiV1AppAppIdIntegrationIntegIdPutRequest, options?: Configuration): Promise<IntegrationOut> {
        return this.api.updateIntegrationApiV1AppAppIdIntegrationIntegIdPut(param.integId, param.appId, param.integrationUpdate, param.idempotencyKey,  options).toPromise();
    }

}

import { ObservableMessageApi } from "./ObservableAPI";
import { MessageApiRequestFactory, MessageApiResponseProcessor} from "../apis/MessageApi";

export interface MessageApiCreateMessageApiV1AppAppIdMsgPostRequest {
    /**
     * 
     * @type string
     * @memberof MessageApicreateMessageApiV1AppAppIdMsgPost
     */
    appId: string
    /**
     * 
     * @type MessageIn
     * @memberof MessageApicreateMessageApiV1AppAppIdMsgPost
     */
    messageIn: MessageIn
    /**
     * 
     * @type boolean
     * @memberof MessageApicreateMessageApiV1AppAppIdMsgPost
     */
    withContent?: boolean
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof MessageApicreateMessageApiV1AppAppIdMsgPost
     */
    idempotencyKey?: string
}

export interface MessageApiGetMessageApiV1AppAppIdMsgMsgIdGetRequest {
    /**
     * 
     * @type string
     * @memberof MessageApigetMessageApiV1AppAppIdMsgMsgIdGet
     */
    msgId: string
    /**
     * 
     * @type string
     * @memberof MessageApigetMessageApiV1AppAppIdMsgMsgIdGet
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof MessageApigetMessageApiV1AppAppIdMsgMsgIdGet
     */
    idempotencyKey?: string
}

export interface MessageApiListMessagesApiV1AppAppIdMsgGetRequest {
    /**
     * 
     * @type string
     * @memberof MessageApilistMessagesApiV1AppAppIdMsgGet
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof MessageApilistMessagesApiV1AppAppIdMsgGet
     */
    iterator?: string
    /**
     * 
     * @type number
     * @memberof MessageApilistMessagesApiV1AppAppIdMsgGet
     */
    limit?: number
    /**
     * 
     * @type Array&lt;string&gt;
     * @memberof MessageApilistMessagesApiV1AppAppIdMsgGet
     */
    eventTypes?: Array<string>
    /**
     * 
     * @type string
     * @memberof MessageApilistMessagesApiV1AppAppIdMsgGet
     */
    channel?: string
    /**
     * 
     * @type Date
     * @memberof MessageApilistMessagesApiV1AppAppIdMsgGet
     */
    before?: Date
    /**
     * 
     * @type Date
     * @memberof MessageApilistMessagesApiV1AppAppIdMsgGet
     */
    after?: Date
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof MessageApilistMessagesApiV1AppAppIdMsgGet
     */
    idempotencyKey?: string
}

export class ObjectMessageApi {
    private api: ObservableMessageApi

    public constructor(configuration: Configuration, requestFactory?: MessageApiRequestFactory, responseProcessor?: MessageApiResponseProcessor) {
        this.api = new ObservableMessageApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates a new message and dispatches it to all of the application's endpoints.  The `eventId` is an optional custom unique ID. It's verified to be unique only up to a day, after that no verification will be made. If a message with the same `eventId` already exists for any application in your environment, a 409 conflict error will be returned.  The `eventType` indicates the type and schema of the event. All messages of a certain `eventType` are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have `channels`, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don't imply a specific message content or schema.  The `payload' property is the webhook's body (the actual webhook message).
     * Create Message
     * @param param the request object
     */
    public createMessageApiV1AppAppIdMsgPost(param: MessageApiCreateMessageApiV1AppAppIdMsgPostRequest, options?: Configuration): Promise<MessageOut> {
        return this.api.createMessageApiV1AppAppIdMsgPost(param.appId, param.messageIn, param.withContent, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Get a message by its ID or eventID.
     * Get Message
     * @param param the request object
     */
    public getMessageApiV1AppAppIdMsgMsgIdGet(param: MessageApiGetMessageApiV1AppAppIdMsgMsgIdGetRequest, options?: Configuration): Promise<MessageOut> {
        return this.api.getMessageApiV1AppAppIdMsgMsgIdGet(param.msgId, param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * List all of the application's messages.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed. The `after` parameter lets you filter all items created after a certain date and is ignored if an iterator is passed. `before` and `after` cannot be used simultaneously.
     * List Messages
     * @param param the request object
     */
    public listMessagesApiV1AppAppIdMsgGet(param: MessageApiListMessagesApiV1AppAppIdMsgGetRequest, options?: Configuration): Promise<ListResponseMessageOut> {
        return this.api.listMessagesApiV1AppAppIdMsgGet(param.appId, param.iterator, param.limit, param.eventTypes, param.channel, param.before, param.after, param.idempotencyKey,  options).toPromise();
    }

}

import { ObservableMessageAttemptApi } from "./ObservableAPI";
import { MessageAttemptApiRequestFactory, MessageAttemptApiResponseProcessor} from "../apis/MessageAttemptApi";

export interface MessageAttemptApiGetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGetRequest {
    /**
     * 
     * @type string
     * @memberof MessageAttemptApigetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet
     */
    attemptId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApigetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet
     */
    msgId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApigetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof MessageAttemptApigetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet
     */
    idempotencyKey?: string
}

export interface MessageAttemptApiListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGetRequest {
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet
     */
    msgId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet
     */
    iterator?: string
    /**
     * 
     * @type number
     * @memberof MessageAttemptApilistAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet
     */
    limit?: number
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof MessageAttemptApilistAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet
     */
    idempotencyKey?: string
}

export interface MessageAttemptApiListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGetRequest {
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet
     */
    endpointId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet
     */
    iterator?: string
    /**
     * 
     * @type number
     * @memberof MessageAttemptApilistAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet
     */
    limit?: number
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet
     */
    channel?: string
    /**
     * 
     * @type MessageStatus
     * @memberof MessageAttemptApilistAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet
     */
    status?: MessageStatus
    /**
     * 
     * @type Date
     * @memberof MessageAttemptApilistAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet
     */
    before?: Date
    /**
     * 
     * @type Date
     * @memberof MessageAttemptApilistAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet
     */
    after?: Date
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof MessageAttemptApilistAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet
     */
    idempotencyKey?: string
}

export interface MessageAttemptApiListAttemptsApiV1AppAppIdMsgMsgIdAttemptGetRequest {
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsApiV1AppAppIdMsgMsgIdAttemptGet
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsApiV1AppAppIdMsgMsgIdAttemptGet
     */
    msgId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsApiV1AppAppIdMsgMsgIdAttemptGet
     */
    iterator?: string
    /**
     * 
     * @type number
     * @memberof MessageAttemptApilistAttemptsApiV1AppAppIdMsgMsgIdAttemptGet
     */
    limit?: number
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsApiV1AppAppIdMsgMsgIdAttemptGet
     */
    endpointId?: string
    /**
     * 
     * @type Array&lt;string&gt;
     * @memberof MessageAttemptApilistAttemptsApiV1AppAppIdMsgMsgIdAttemptGet
     */
    eventTypes?: Array<string>
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsApiV1AppAppIdMsgMsgIdAttemptGet
     */
    channel?: string
    /**
     * 
     * @type MessageStatus
     * @memberof MessageAttemptApilistAttemptsApiV1AppAppIdMsgMsgIdAttemptGet
     */
    status?: MessageStatus
    /**
     * 
     * @type Date
     * @memberof MessageAttemptApilistAttemptsApiV1AppAppIdMsgMsgIdAttemptGet
     */
    before?: Date
    /**
     * 
     * @type Date
     * @memberof MessageAttemptApilistAttemptsApiV1AppAppIdMsgMsgIdAttemptGet
     */
    after?: Date
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof MessageAttemptApilistAttemptsApiV1AppAppIdMsgMsgIdAttemptGet
     */
    idempotencyKey?: string
}

export interface MessageAttemptApiListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGetRequest {
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet
     */
    endpointId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet
     */
    iterator?: string
    /**
     * 
     * @type number
     * @memberof MessageAttemptApilistAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet
     */
    limit?: number
    /**
     * 
     * @type MessageStatus
     * @memberof MessageAttemptApilistAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet
     */
    status?: MessageStatus
    /**
     * 
     * @type StatusCodeClass
     * @memberof MessageAttemptApilistAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet
     */
    statusCodeClass?: StatusCodeClass
    /**
     * 
     * @type Array&lt;string&gt;
     * @memberof MessageAttemptApilistAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet
     */
    eventTypes?: Array<string>
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet
     */
    channel?: string
    /**
     * 
     * @type Date
     * @memberof MessageAttemptApilistAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet
     */
    before?: Date
    /**
     * 
     * @type Date
     * @memberof MessageAttemptApilistAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet
     */
    after?: Date
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof MessageAttemptApilistAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet
     */
    idempotencyKey?: string
}

export interface MessageAttemptApiListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGetRequest {
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    msgId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    endpointId?: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    iterator?: string
    /**
     * 
     * @type number
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    limit?: number
    /**
     * 
     * @type MessageStatus
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    status?: MessageStatus
    /**
     * 
     * @type StatusCodeClass
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    statusCodeClass?: StatusCodeClass
    /**
     * 
     * @type Array&lt;string&gt;
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    eventTypes?: Array<string>
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    channel?: string
    /**
     * 
     * @type Date
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    before?: Date
    /**
     * 
     * @type Date
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    after?: Date
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof MessageAttemptApilistAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet
     */
    idempotencyKey?: string
}

export interface MessageAttemptApiListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGetRequest {
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet
     */
    msgId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet
     */
    appId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet
     */
    endpointId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet
     */
    iterator?: string
    /**
     * 
     * @type number
     * @memberof MessageAttemptApilistAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet
     */
    limit?: number
    /**
     * 
     * @type Array&lt;string&gt;
     * @memberof MessageAttemptApilistAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet
     */
    eventTypes?: Array<string>
    /**
     * 
     * @type string
     * @memberof MessageAttemptApilistAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet
     */
    channel?: string
    /**
     * 
     * @type MessageStatus
     * @memberof MessageAttemptApilistAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet
     */
    status?: MessageStatus
    /**
     * 
     * @type Date
     * @memberof MessageAttemptApilistAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet
     */
    before?: Date
    /**
     * 
     * @type Date
     * @memberof MessageAttemptApilistAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet
     */
    after?: Date
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof MessageAttemptApilistAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet
     */
    idempotencyKey?: string
}

export interface MessageAttemptApiResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPostRequest {
    /**
     * 
     * @type string
     * @memberof MessageAttemptApiresendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost
     */
    endpointId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApiresendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost
     */
    msgId: string
    /**
     * 
     * @type string
     * @memberof MessageAttemptApiresendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost
     */
    appId: string
    /**
     * The request&#39;s idempotency key
     * @type string
     * @memberof MessageAttemptApiresendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost
     */
    idempotencyKey?: string
}

export class ObjectMessageAttemptApi {
    private api: ObservableMessageAttemptApi

    public constructor(configuration: Configuration, requestFactory?: MessageAttemptApiRequestFactory, responseProcessor?: MessageAttemptApiResponseProcessor) {
        this.api = new ObservableMessageAttemptApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * `msg_id`: Use a message id or a message `eventId`
     * Get Attempt
     * @param param the request object
     */
    public getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(param: MessageAttemptApiGetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGetRequest, options?: Configuration): Promise<MessageAttemptOut> {
        return this.api.getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(param.attemptId, param.msgId, param.appId, param.idempotencyKey,  options).toPromise();
    }

    /**
     * `msg_id`: Use a message id or a message `eventId`
     * List Attempted Destinations
     * @param param the request object
     */
    public listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(param: MessageAttemptApiListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGetRequest, options?: Configuration): Promise<ListResponseMessageEndpointOut> {
        return this.api.listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(param.msgId, param.appId, param.iterator, param.limit, param.idempotencyKey,  options).toPromise();
    }

    /**
     * List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.
     * List Attempted Messages
     * @param param the request object
     */
    public listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(param: MessageAttemptApiListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGetRequest, options?: Configuration): Promise<ListResponseEndpointMessageOut> {
        return this.api.listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(param.endpointId, param.appId, param.iterator, param.limit, param.channel, param.status, param.before, param.after, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Deprecated: Please use \"List Attempts by Endpoint\" and \"List Attempts by Msg\" instead.  `msg_id`: Use a message id or a message `eventId`
     * List Attempts
     * @param param the request object
     */
    public listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(param: MessageAttemptApiListAttemptsApiV1AppAppIdMsgMsgIdAttemptGetRequest, options?: Configuration): Promise<ListResponseMessageAttemptOut> {
        return this.api.listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(param.appId, param.msgId, param.iterator, param.limit, param.endpointId, param.eventTypes, param.channel, param.status, param.before, param.after, param.idempotencyKey,  options).toPromise();
    }

    /**
     * List attempts by endpoint id
     * List Attempts By Endpoint
     * @param param the request object
     */
    public listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(param: MessageAttemptApiListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGetRequest, options?: Configuration): Promise<ListResponseMessageAttemptOut> {
        return this.api.listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(param.appId, param.endpointId, param.iterator, param.limit, param.status, param.statusCodeClass, param.eventTypes, param.channel, param.before, param.after, param.idempotencyKey,  options).toPromise();
    }

    /**
     * List attempts by message id
     * List Attempts By Msg
     * @param param the request object
     */
    public listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(param: MessageAttemptApiListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGetRequest, options?: Configuration): Promise<ListResponseMessageAttemptOut> {
        return this.api.listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(param.appId, param.msgId, param.endpointId, param.iterator, param.limit, param.status, param.statusCodeClass, param.eventTypes, param.channel, param.before, param.after, param.idempotencyKey,  options).toPromise();
    }

    /**
     * DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.
     * List Attempts For Endpoint
     * @param param the request object
     */
    public listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(param: MessageAttemptApiListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGetRequest, options?: Configuration): Promise<ListResponseMessageAttemptEndpointOut> {
        return this.api.listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(param.msgId, param.appId, param.endpointId, param.iterator, param.limit, param.eventTypes, param.channel, param.status, param.before, param.after, param.idempotencyKey,  options).toPromise();
    }

    /**
     * Resend a message to the specified endpoint.
     * Resend Webhook
     * @param param the request object
     */
    public resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(param: MessageAttemptApiResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPostRequest, options?: Configuration): Promise<void> {
        return this.api.resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(param.endpointId, param.msgId, param.appId, param.idempotencyKey,  options).toPromise();
    }

}
