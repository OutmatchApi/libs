import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { ApiApp } from '../models/ApiApp';
import { ApiAppRequest } from '../models/ApiAppRequest';
import { Language } from '../models/Language';
import { Logo } from '../models/Logo';
import { Release } from '../models/Release';
import { ReleaseRequest } from '../models/ReleaseRequest';
import { Sdk } from '../models/Sdk';
import { SdkRequest } from '../models/SdkRequest';
import { SdkResponse } from '../models/SdkResponse';
import { Spec } from '../models/Spec';
import { User } from '../models/User';
import { UserPostRequest } from '../models/UserPostRequest';
import { UserPutRequest } from '../models/UserPutRequest';

import { ApiAppApiRequestFactory, ApiAppApiResponseProcessor} from "../apis/ApiAppApi";
export class ObservableApiAppApi {
    private requestFactory: ApiAppApiRequestFactory;
    private responseProcessor: ApiAppApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ApiAppApiRequestFactory,
        responseProcessor?: ApiAppApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ApiAppApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ApiAppApiResponseProcessor();
    }

    /**
     * Create an api app for the authenticated user
     * Create api app
     * @param apiAppRequest Created api app object
     */
    public createApiApp(apiAppRequest?: ApiAppRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.createApiApp(apiAppRequest, _options);

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
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createApiApp(rsp)));
            }));
    }

    /**
     * Create an api app release
     * Create api app release
     * @param releaseRequest Created release object
     */
    public createApiAppRelease(releaseRequest?: ReleaseRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.createApiAppRelease(releaseRequest, _options);

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
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createApiAppRelease(rsp)));
            }));
    }

    /**
     * Generate sdks for a relase
     * Generate sdks for a relase
     * @param sdkRequest Created sdks objects
     */
    public createApiAppReleaseSdks(sdkRequest?: SdkRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.createApiAppReleaseSdks(sdkRequest, _options);

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
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createApiAppReleaseSdks(rsp)));
            }));
    }

}

import { UserApiRequestFactory, UserApiResponseProcessor} from "../apis/UserApi";
export class ObservableUserApi {
    private requestFactory: UserApiRequestFactory;
    private responseProcessor: UserApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: UserApiRequestFactory,
        responseProcessor?: UserApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new UserApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new UserApiResponseProcessor();
    }

    /**
     * This can only be done by the logged in user.
     * Create user
     * @param userPostRequest Created user object
     */
    public createUser(userPostRequest?: UserPostRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.createUser(userPostRequest, _options);

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
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createUser(rsp)));
            }));
    }

    /**
     * This can only be done by the logged in user.
     * Update user
     * @param username name that need to be deleted
     * @param userPutRequest Update an existent user in the store
     */
    public updateUser(username: string, userPutRequest?: UserPutRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateUser(username, userPutRequest, _options);

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
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateUser(rsp)));
            }));
    }

}