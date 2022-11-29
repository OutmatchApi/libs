import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
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

import { ApplicationApiRequestFactory, ApplicationApiResponseProcessor} from "../apis/ApplicationApi";
export class ObservableApplicationApi {
    private requestFactory: ApplicationApiRequestFactory;
    private responseProcessor: ApplicationApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ApplicationApiRequestFactory,
        responseProcessor?: ApplicationApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ApplicationApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ApplicationApiResponseProcessor();
    }

    /**
     * Create a new application.
     * Create Application
     * @param applicationIn 
     * @param getIfExists Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs.
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public createApplicationApiV1AppPost(applicationIn: ApplicationIn, getIfExists?: boolean, idempotencyKey?: string, _options?: Configuration): Observable<ApplicationOut> {
        const requestContextPromise = this.requestFactory.createApplicationApiV1AppPost(applicationIn, getIfExists, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createApplicationApiV1AppPost(rsp)));
            }));
    }

    /**
     * Delete an application.
     * Delete Application
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public deleteApplicationApiV1AppAppIdDelete(appId: string, idempotencyKey?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteApplicationApiV1AppAppIdDelete(appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteApplicationApiV1AppAppIdDelete(rsp)));
            }));
    }

    /**
     * Get an application.
     * Get Application
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getApplicationApiV1AppAppIdGet(appId: string, idempotencyKey?: string, _options?: Configuration): Observable<ApplicationOut> {
        const requestContextPromise = this.requestFactory.getApplicationApiV1AppAppIdGet(appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getApplicationApiV1AppAppIdGet(rsp)));
            }));
    }

    /**
     * List of all the organization's applications.
     * List Applications
     * @param iterator 
     * @param limit 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listApplicationsApiV1AppGet(iterator?: string, limit?: number, idempotencyKey?: string, _options?: Configuration): Observable<ListResponseApplicationOut> {
        const requestContextPromise = this.requestFactory.listApplicationsApiV1AppGet(iterator, limit, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listApplicationsApiV1AppGet(rsp)));
            }));
    }

    /**
     * Update an application.
     * Update Application
     * @param appId 
     * @param applicationIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public updateApplicationApiV1AppAppIdPut(appId: string, applicationIn: ApplicationIn, idempotencyKey?: string, _options?: Configuration): Observable<ApplicationOut> {
        const requestContextPromise = this.requestFactory.updateApplicationApiV1AppAppIdPut(appId, applicationIn, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateApplicationApiV1AppAppIdPut(rsp)));
            }));
    }

}

import { AuthenticationApiRequestFactory, AuthenticationApiResponseProcessor} from "../apis/AuthenticationApi";
export class ObservableAuthenticationApi {
    private requestFactory: AuthenticationApiRequestFactory;
    private responseProcessor: AuthenticationApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AuthenticationApiRequestFactory,
        responseProcessor?: AuthenticationApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AuthenticationApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AuthenticationApiResponseProcessor();
    }

    /**
     * Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.
     * Get Consumer App Portal Access
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getDashboardAccessApiV1AuthDashboardAccessAppIdPost(appId: string, idempotencyKey?: string, _options?: Configuration): Observable<DashboardAccessOut> {
        const requestContextPromise = this.requestFactory.getDashboardAccessApiV1AuthDashboardAccessAppIdPost(appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getDashboardAccessApiV1AuthDashboardAccessAppIdPost(rsp)));
            }));
    }

    /**
     * Logout an app token.  Trying to log out other tokens will fail.
     * Logout
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public logoutApiV1AuthLogoutPost(idempotencyKey?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.logoutApiV1AuthLogoutPost(idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.logoutApiV1AuthLogoutPost(rsp)));
            }));
    }

}

import { EndpointApiRequestFactory, EndpointApiResponseProcessor} from "../apis/EndpointApi";
export class ObservableEndpointApi {
    private requestFactory: EndpointApiRequestFactory;
    private responseProcessor: EndpointApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EndpointApiRequestFactory,
        responseProcessor?: EndpointApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EndpointApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EndpointApiResponseProcessor();
    }

    /**
     * Create a new endpoint for the application.  When `secret` is `null` the secret is automatically generated (recommended)
     * Create Endpoint
     * @param appId 
     * @param endpointIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public createEndpointApiV1AppAppIdEndpointPost(appId: string, endpointIn: EndpointIn, idempotencyKey?: string, _options?: Configuration): Observable<EndpointOut> {
        const requestContextPromise = this.requestFactory.createEndpointApiV1AppAppIdEndpointPost(appId, endpointIn, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createEndpointApiV1AppAppIdEndpointPost(rsp)));
            }));
    }

    /**
     * Delete an endpoint.
     * Delete Endpoint
     * @param endpointId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(endpointId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(endpointId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(rsp)));
            }));
    }

    /**
     * Get an application.
     * Get Endpoint
     * @param endpointId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getEndpointApiV1AppAppIdEndpointEndpointIdGet(endpointId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<EndpointOut> {
        const requestContextPromise = this.requestFactory.getEndpointApiV1AppAppIdEndpointEndpointIdGet(endpointId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getEndpointApiV1AppAppIdEndpointEndpointIdGet(rsp)));
            }));
    }

    /**
     * Get the additional headers to be sent with the webhook
     * Get Endpoint Headers
     * @param endpointId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(endpointId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<EndpointHeadersOut> {
        const requestContextPromise = this.requestFactory.getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(endpointId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(rsp)));
            }));
    }

    /**
     * Get the endpoint's signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).
     * Get Endpoint Secret
     * @param endpointId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(endpointId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<EndpointSecretOut> {
        const requestContextPromise = this.requestFactory.getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(endpointId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(rsp)));
            }));
    }

    /**
     * Get basic statistics for the endpoint.
     * Get Endpoint Stats
     * @param endpointId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(endpointId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<EndpointStats> {
        const requestContextPromise = this.requestFactory.getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(endpointId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(rsp)));
            }));
    }

    /**
     * List the application's endpoints.
     * List Endpoints
     * @param appId 
     * @param iterator 
     * @param limit 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listEndpointsApiV1AppAppIdEndpointGet(appId: string, iterator?: string, limit?: number, idempotencyKey?: string, _options?: Configuration): Observable<ListResponseEndpointOut> {
        const requestContextPromise = this.requestFactory.listEndpointsApiV1AppAppIdEndpointGet(appId, iterator, limit, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listEndpointsApiV1AppAppIdEndpointGet(rsp)));
            }));
    }

    /**
     * Partially set the additional headers to be sent with the webhook
     * Patch Endpoint Headers
     * @param appId 
     * @param endpointId 
     * @param endpointHeadersPatchIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(appId: string, endpointId: string, endpointHeadersPatchIn: EndpointHeadersPatchIn, idempotencyKey?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(appId, endpointId, endpointHeadersPatchIn, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(rsp)));
            }));
    }

    /**
     * Resend all failed messages since a given time.
     * Recover Failed Webhooks
     * @param appId 
     * @param endpointId 
     * @param recoverIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(appId: string, endpointId: string, recoverIn: RecoverIn, idempotencyKey?: string, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(appId, endpointId, recoverIn, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(rsp)));
            }));
    }

    /**
     * Replays messages to the endpoint. Only messages that were created after `since` will be sent. Messages that were previously sent to the endpoint are not resent.
     * Replay Missing Webhooks
     * @param appId 
     * @param endpointId 
     * @param replayIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(appId: string, endpointId: string, replayIn: ReplayIn, idempotencyKey?: string, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(appId, endpointId, replayIn, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(rsp)));
            }));
    }

    /**
     * Rotates the endpoint's signing secret.  The previous secret will be valid for the next 24 hours.
     * Rotate Endpoint Secret
     * @param endpointId 
     * @param appId 
     * @param endpointSecretRotateIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(endpointId: string, appId: string, endpointSecretRotateIn: EndpointSecretRotateIn, idempotencyKey?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(endpointId, appId, endpointSecretRotateIn, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(rsp)));
            }));
    }

    /**
     * Update an endpoint.
     * Update Endpoint
     * @param endpointId 
     * @param appId 
     * @param endpointUpdate 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public updateEndpointApiV1AppAppIdEndpointEndpointIdPut(endpointId: string, appId: string, endpointUpdate: EndpointUpdate, idempotencyKey?: string, _options?: Configuration): Observable<EndpointOut> {
        const requestContextPromise = this.requestFactory.updateEndpointApiV1AppAppIdEndpointEndpointIdPut(endpointId, appId, endpointUpdate, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateEndpointApiV1AppAppIdEndpointEndpointIdPut(rsp)));
            }));
    }

    /**
     * Set the additional headers to be sent with the webhook
     * Update Endpoint Headers
     * @param appId 
     * @param endpointId 
     * @param endpointHeadersIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(appId: string, endpointId: string, endpointHeadersIn: EndpointHeadersIn, idempotencyKey?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(appId, endpointId, endpointHeadersIn, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(rsp)));
            }));
    }

}

import { EventTypeApiRequestFactory, EventTypeApiResponseProcessor} from "../apis/EventTypeApi";
export class ObservableEventTypeApi {
    private requestFactory: EventTypeApiRequestFactory;
    private responseProcessor: EventTypeApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EventTypeApiRequestFactory,
        responseProcessor?: EventTypeApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EventTypeApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EventTypeApiResponseProcessor();
    }

    /**
     * Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.
     * Create Event Type
     * @param eventTypeIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public createEventTypeApiV1EventTypePost(eventTypeIn: EventTypeIn, idempotencyKey?: string, _options?: Configuration): Observable<EventTypeOut> {
        const requestContextPromise = this.requestFactory.createEventTypeApiV1EventTypePost(eventTypeIn, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createEventTypeApiV1EventTypePost(rsp)));
            }));
    }

    /**
     * Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).
     * Archive Event Type
     * @param eventTypeName 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public deleteEventTypeApiV1EventTypeEventTypeNameDelete(eventTypeName: string, idempotencyKey?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteEventTypeApiV1EventTypeEventTypeNameDelete(eventTypeName, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteEventTypeApiV1EventTypeEventTypeNameDelete(rsp)));
            }));
    }

    /**
     * Get an event type.
     * Get Event Type
     * @param eventTypeName 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getEventTypeApiV1EventTypeEventTypeNameGet(eventTypeName: string, idempotencyKey?: string, _options?: Configuration): Observable<EventTypeOut> {
        const requestContextPromise = this.requestFactory.getEventTypeApiV1EventTypeEventTypeNameGet(eventTypeName, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getEventTypeApiV1EventTypeEventTypeNameGet(rsp)));
            }));
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
    public listEventTypesApiV1EventTypeGet(iterator?: string, limit?: number, withContent?: boolean, includeArchived?: boolean, idempotencyKey?: string, _options?: Configuration): Observable<ListResponseEventTypeOut> {
        const requestContextPromise = this.requestFactory.listEventTypesApiV1EventTypeGet(iterator, limit, withContent, includeArchived, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listEventTypesApiV1EventTypeGet(rsp)));
            }));
    }

    /**
     * Update an event type.
     * Update Event Type
     * @param eventTypeName 
     * @param eventTypeUpdate 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public updateEventTypeApiV1EventTypeEventTypeNamePut(eventTypeName: string, eventTypeUpdate: EventTypeUpdate, idempotencyKey?: string, _options?: Configuration): Observable<EventTypeOut> {
        const requestContextPromise = this.requestFactory.updateEventTypeApiV1EventTypeEventTypeNamePut(eventTypeName, eventTypeUpdate, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateEventTypeApiV1EventTypeEventTypeNamePut(rsp)));
            }));
    }

}

import { HealthApiRequestFactory, HealthApiResponseProcessor} from "../apis/HealthApi";
export class ObservableHealthApi {
    private requestFactory: HealthApiRequestFactory;
    private responseProcessor: HealthApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: HealthApiRequestFactory,
        responseProcessor?: HealthApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new HealthApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new HealthApiResponseProcessor();
    }

    /**
     * Verify the API server is up and running.
     * Health
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public healthApiV1HealthGet(idempotencyKey?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.healthApiV1HealthGet(idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.healthApiV1HealthGet(rsp)));
            }));
    }

}

import { IntegrationApiRequestFactory, IntegrationApiResponseProcessor} from "../apis/IntegrationApi";
export class ObservableIntegrationApi {
    private requestFactory: IntegrationApiRequestFactory;
    private responseProcessor: IntegrationApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: IntegrationApiRequestFactory,
        responseProcessor?: IntegrationApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new IntegrationApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new IntegrationApiResponseProcessor();
    }

    /**
     * Create an integration.
     * Create Integration
     * @param appId 
     * @param integrationIn 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public createIntegrationApiV1AppAppIdIntegrationPost(appId: string, integrationIn: IntegrationIn, idempotencyKey?: string, _options?: Configuration): Observable<IntegrationOut> {
        const requestContextPromise = this.requestFactory.createIntegrationApiV1AppAppIdIntegrationPost(appId, integrationIn, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createIntegrationApiV1AppAppIdIntegrationPost(rsp)));
            }));
    }

    /**
     * Delete an integration and revoke it's key.
     * Delete Integration
     * @param integId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(integId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(integId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(rsp)));
            }));
    }

    /**
     * Get an integration.
     * Get Integration
     * @param integId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getIntegrationApiV1AppAppIdIntegrationIntegIdGet(integId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<IntegrationOut> {
        const requestContextPromise = this.requestFactory.getIntegrationApiV1AppAppIdIntegrationIntegIdGet(integId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getIntegrationApiV1AppAppIdIntegrationIntegIdGet(rsp)));
            }));
    }

    /**
     * Get an integration's key.
     * Get Integration Key
     * @param integId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(integId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<IntegrationKeyOut> {
        const requestContextPromise = this.requestFactory.getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(integId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(rsp)));
            }));
    }

    /**
     * List the application's integrations.
     * List Integrations
     * @param appId 
     * @param iterator 
     * @param limit 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public listIntegrationsApiV1AppAppIdIntegrationGet(appId: string, iterator?: string, limit?: number, idempotencyKey?: string, _options?: Configuration): Observable<ListResponseIntegrationOut> {
        const requestContextPromise = this.requestFactory.listIntegrationsApiV1AppAppIdIntegrationGet(appId, iterator, limit, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listIntegrationsApiV1AppAppIdIntegrationGet(rsp)));
            }));
    }

    /**
     * Rotate the integration's key. The previous key will be immediately revoked.
     * Rotate Integration Key
     * @param integId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(integId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<IntegrationKeyOut> {
        const requestContextPromise = this.requestFactory.rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(integId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(rsp)));
            }));
    }

    /**
     * Update an integration.
     * Update Integration
     * @param integId 
     * @param appId 
     * @param integrationUpdate 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public updateIntegrationApiV1AppAppIdIntegrationIntegIdPut(integId: string, appId: string, integrationUpdate: IntegrationUpdate, idempotencyKey?: string, _options?: Configuration): Observable<IntegrationOut> {
        const requestContextPromise = this.requestFactory.updateIntegrationApiV1AppAppIdIntegrationIntegIdPut(integId, appId, integrationUpdate, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateIntegrationApiV1AppAppIdIntegrationIntegIdPut(rsp)));
            }));
    }

}

import { MessageApiRequestFactory, MessageApiResponseProcessor} from "../apis/MessageApi";
export class ObservableMessageApi {
    private requestFactory: MessageApiRequestFactory;
    private responseProcessor: MessageApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MessageApiRequestFactory,
        responseProcessor?: MessageApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MessageApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MessageApiResponseProcessor();
    }

    /**
     * Creates a new message and dispatches it to all of the application's endpoints.  The `eventId` is an optional custom unique ID. It's verified to be unique only up to a day, after that no verification will be made. If a message with the same `eventId` already exists for any application in your environment, a 409 conflict error will be returned.  The `eventType` indicates the type and schema of the event. All messages of a certain `eventType` are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have `channels`, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don't imply a specific message content or schema.  The `payload' property is the webhook's body (the actual webhook message).
     * Create Message
     * @param appId 
     * @param messageIn 
     * @param withContent 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public createMessageApiV1AppAppIdMsgPost(appId: string, messageIn: MessageIn, withContent?: boolean, idempotencyKey?: string, _options?: Configuration): Observable<MessageOut> {
        const requestContextPromise = this.requestFactory.createMessageApiV1AppAppIdMsgPost(appId, messageIn, withContent, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createMessageApiV1AppAppIdMsgPost(rsp)));
            }));
    }

    /**
     * Get a message by its ID or eventID.
     * Get Message
     * @param msgId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getMessageApiV1AppAppIdMsgMsgIdGet(msgId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<MessageOut> {
        const requestContextPromise = this.requestFactory.getMessageApiV1AppAppIdMsgMsgIdGet(msgId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getMessageApiV1AppAppIdMsgMsgIdGet(rsp)));
            }));
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
    public listMessagesApiV1AppAppIdMsgGet(appId: string, iterator?: string, limit?: number, eventTypes?: Array<string>, channel?: string, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Observable<ListResponseMessageOut> {
        const requestContextPromise = this.requestFactory.listMessagesApiV1AppAppIdMsgGet(appId, iterator, limit, eventTypes, channel, before, after, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listMessagesApiV1AppAppIdMsgGet(rsp)));
            }));
    }

}

import { MessageAttemptApiRequestFactory, MessageAttemptApiResponseProcessor} from "../apis/MessageAttemptApi";
export class ObservableMessageAttemptApi {
    private requestFactory: MessageAttemptApiRequestFactory;
    private responseProcessor: MessageAttemptApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MessageAttemptApiRequestFactory,
        responseProcessor?: MessageAttemptApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MessageAttemptApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MessageAttemptApiResponseProcessor();
    }

    /**
     * `msg_id`: Use a message id or a message `eventId`
     * Get Attempt
     * @param attemptId 
     * @param msgId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(attemptId: string, msgId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<MessageAttemptOut> {
        const requestContextPromise = this.requestFactory.getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(attemptId, msgId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(rsp)));
            }));
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
    public listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(msgId: string, appId: string, iterator?: string, limit?: number, idempotencyKey?: string, _options?: Configuration): Observable<ListResponseMessageEndpointOut> {
        const requestContextPromise = this.requestFactory.listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(msgId, appId, iterator, limit, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(rsp)));
            }));
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
    public listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(endpointId: string, appId: string, iterator?: string, limit?: number, channel?: string, status?: MessageStatus, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Observable<ListResponseEndpointMessageOut> {
        const requestContextPromise = this.requestFactory.listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(endpointId, appId, iterator, limit, channel, status, before, after, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(rsp)));
            }));
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
    public listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(appId: string, msgId: string, iterator?: string, limit?: number, endpointId?: string, eventTypes?: Array<string>, channel?: string, status?: MessageStatus, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Observable<ListResponseMessageAttemptOut> {
        const requestContextPromise = this.requestFactory.listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(appId, msgId, iterator, limit, endpointId, eventTypes, channel, status, before, after, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(rsp)));
            }));
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
    public listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(appId: string, endpointId: string, iterator?: string, limit?: number, status?: MessageStatus, statusCodeClass?: StatusCodeClass, eventTypes?: Array<string>, channel?: string, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Observable<ListResponseMessageAttemptOut> {
        const requestContextPromise = this.requestFactory.listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(appId, endpointId, iterator, limit, status, statusCodeClass, eventTypes, channel, before, after, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(rsp)));
            }));
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
    public listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(appId: string, msgId: string, endpointId?: string, iterator?: string, limit?: number, status?: MessageStatus, statusCodeClass?: StatusCodeClass, eventTypes?: Array<string>, channel?: string, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Observable<ListResponseMessageAttemptOut> {
        const requestContextPromise = this.requestFactory.listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(appId, msgId, endpointId, iterator, limit, status, statusCodeClass, eventTypes, channel, before, after, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(rsp)));
            }));
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
    public listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(msgId: string, appId: string, endpointId: string, iterator?: string, limit?: number, eventTypes?: Array<string>, channel?: string, status?: MessageStatus, before?: Date, after?: Date, idempotencyKey?: string, _options?: Configuration): Observable<ListResponseMessageAttemptEndpointOut> {
        const requestContextPromise = this.requestFactory.listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(msgId, appId, endpointId, iterator, limit, eventTypes, channel, status, before, after, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(rsp)));
            }));
    }

    /**
     * Resend a message to the specified endpoint.
     * Resend Webhook
     * @param endpointId 
     * @param msgId 
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key
     */
    public resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(endpointId: string, msgId: string, appId: string, idempotencyKey?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(endpointId, msgId, appId, idempotencyKey, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(rsp)));
            }));
    }

}
