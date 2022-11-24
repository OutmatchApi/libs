import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ApiApp } from '../models/ApiApp';
import { CreateApiAppReleaseSdksRequest } from '../models/CreateApiAppReleaseSdksRequest';
import { CreateApiAppRequest } from '../models/CreateApiAppRequest';
import { CreateUserRequest } from '../models/CreateUserRequest';
import { Language } from '../models/Language';
import { Logo } from '../models/Logo';
import { ModelError } from '../models/ModelError';
import { Release } from '../models/Release';
import { Sdk } from '../models/Sdk';
import { Spec } from '../models/Spec';
import { Status } from '../models/Status';
import { UpdateUserRequest } from '../models/UpdateUserRequest';
import { User } from '../models/User';
import { ObservableApiAppApi } from './ObservableAPI';

import { ApiAppApiRequestFactory, ApiAppApiResponseProcessor} from "../apis/ApiAppApi";
export class PromiseApiAppApi {
    private api: ObservableApiAppApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ApiAppApiRequestFactory,
        responseProcessor?: ApiAppApiResponseProcessor
    ) {
        this.api = new ObservableApiAppApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an api app for the authenticated user
     * Create api app
     * @param createApiAppRequest 
     */
    public createApiApp(createApiAppRequest?: CreateApiAppRequest, _options?: Configuration): Promise<ApiApp> {
        const result = this.api.createApiApp(createApiAppRequest, _options);
        return result.toPromise();
    }

    /**
     * Create an api app release
     * Create api app release
     * @param appId app id to associate the release with
     * @param body Created release object
     */
    public createApiAppRelease(appId: string, body?: string, _options?: Configuration): Promise<Release> {
        const result = this.api.createApiAppRelease(appId, body, _options);
        return result.toPromise();
    }

    /**
     * Generate sdks for a relase
     * Generate sdks for a relase
     * @param appId app id
     * @param releaseVersion release id
     * @param createApiAppReleaseSdksRequest 
     */
    public createApiAppReleaseSdks(appId: string, releaseVersion: string, createApiAppReleaseSdksRequest?: CreateApiAppReleaseSdksRequest, _options?: Configuration): Promise<Array<Sdk>> {
        const result = this.api.createApiAppReleaseSdks(appId, releaseVersion, createApiAppReleaseSdksRequest, _options);
        return result.toPromise();
    }


}



import { ObservableStatusApi } from './ObservableAPI';

import { StatusApiRequestFactory, StatusApiResponseProcessor} from "../apis/StatusApi";
export class PromiseStatusApi {
    private api: ObservableStatusApi

    public constructor(
        configuration: Configuration,
        requestFactory?: StatusApiRequestFactory,
        responseProcessor?: StatusApiResponseProcessor
    ) {
        this.api = new ObservableStatusApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Check the API status
     */
    public getStatus(_options?: Configuration): Promise<void> {
        const result = this.api.getStatus(_options);
        return result.toPromise();
    }


}



import { ObservableUserApi } from './ObservableAPI';

import { UserApiRequestFactory, UserApiResponseProcessor} from "../apis/UserApi";
export class PromiseUserApi {
    private api: ObservableUserApi

    public constructor(
        configuration: Configuration,
        requestFactory?: UserApiRequestFactory,
        responseProcessor?: UserApiResponseProcessor
    ) {
        this.api = new ObservableUserApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This can only be done by the logged in user.
     * Create user
     * @param createUserRequest 
     */
    public createUser(createUserRequest?: CreateUserRequest, _options?: Configuration): Promise<User> {
        const result = this.api.createUser(createUserRequest, _options);
        return result.toPromise();
    }

    /**
     * This can only be done by the logged in user.
     * Update user
     * @param updateUserRequest 
     */
    public updateUser(updateUserRequest?: UpdateUserRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateUser(updateUserRequest, _options);
        return result.toPromise();
    }


}



