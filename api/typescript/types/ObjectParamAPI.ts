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

import { ObservableApiAppApi } from "./ObservableAPI";
import { ApiAppApiRequestFactory, ApiAppApiResponseProcessor} from "../apis/ApiAppApi";

export interface ApiAppApiCreateApiAppRequest {
    /**
     * 
     * @type CreateApiAppRequest
     * @memberof ApiAppApicreateApiApp
     */
    createApiAppRequest?: CreateApiAppRequest
}

export interface ApiAppApiCreateApiAppReleaseRequest {
    /**
     * app id to associate the release with
     * @type string
     * @memberof ApiAppApicreateApiAppRelease
     */
    appId: string
    /**
     * Created release object
     * @type string
     * @memberof ApiAppApicreateApiAppRelease
     */
    body?: string
}

export interface ApiAppApiCreateApiAppReleaseSdksRequest {
    /**
     * app id
     * @type string
     * @memberof ApiAppApicreateApiAppReleaseSdks
     */
    appId: string
    /**
     * release id
     * @type string
     * @memberof ApiAppApicreateApiAppReleaseSdks
     */
    releaseVersion: string
    /**
     * 
     * @type CreateApiAppReleaseSdksRequest
     * @memberof ApiAppApicreateApiAppReleaseSdks
     */
    createApiAppReleaseSdksRequest?: CreateApiAppReleaseSdksRequest
}

export class ObjectApiAppApi {
    private api: ObservableApiAppApi

    public constructor(configuration: Configuration, requestFactory?: ApiAppApiRequestFactory, responseProcessor?: ApiAppApiResponseProcessor) {
        this.api = new ObservableApiAppApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an api app for the authenticated user
     * Create api app
     * @param param the request object
     */
    public createApiApp(param: ApiAppApiCreateApiAppRequest = {}, options?: Configuration): Promise<ApiApp> {
        return this.api.createApiApp(param.createApiAppRequest,  options).toPromise();
    }

    /**
     * Create an api app release
     * Create api app release
     * @param param the request object
     */
    public createApiAppRelease(param: ApiAppApiCreateApiAppReleaseRequest, options?: Configuration): Promise<Release> {
        return this.api.createApiAppRelease(param.appId, param.body,  options).toPromise();
    }

    /**
     * Generate sdks for a relase
     * Generate sdks for a relase
     * @param param the request object
     */
    public createApiAppReleaseSdks(param: ApiAppApiCreateApiAppReleaseSdksRequest, options?: Configuration): Promise<Array<Sdk>> {
        return this.api.createApiAppReleaseSdks(param.appId, param.releaseVersion, param.createApiAppReleaseSdksRequest,  options).toPromise();
    }

}

import { ObservableStatusApi } from "./ObservableAPI";
import { StatusApiRequestFactory, StatusApiResponseProcessor} from "../apis/StatusApi";

export interface StatusApiGetStatusRequest {
}

export class ObjectStatusApi {
    private api: ObservableStatusApi

    public constructor(configuration: Configuration, requestFactory?: StatusApiRequestFactory, responseProcessor?: StatusApiResponseProcessor) {
        this.api = new ObservableStatusApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Check the API status
     * @param param the request object
     */
    public getStatus(param: StatusApiGetStatusRequest = {}, options?: Configuration): Promise<void> {
        return this.api.getStatus( options).toPromise();
    }

}

import { ObservableUserApi } from "./ObservableAPI";
import { UserApiRequestFactory, UserApiResponseProcessor} from "../apis/UserApi";

export interface UserApiCreateUserRequest {
    /**
     * 
     * @type CreateUserRequest
     * @memberof UserApicreateUser
     */
    createUserRequest?: CreateUserRequest
}

export interface UserApiUpdateUserRequest {
    /**
     * 
     * @type UpdateUserRequest
     * @memberof UserApiupdateUser
     */
    updateUserRequest?: UpdateUserRequest
}

export class ObjectUserApi {
    private api: ObservableUserApi

    public constructor(configuration: Configuration, requestFactory?: UserApiRequestFactory, responseProcessor?: UserApiResponseProcessor) {
        this.api = new ObservableUserApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This can only be done by the logged in user.
     * Create user
     * @param param the request object
     */
    public createUser(param: UserApiCreateUserRequest = {}, options?: Configuration): Promise<User> {
        return this.api.createUser(param.createUserRequest,  options).toPromise();
    }

    /**
     * This can only be done by the logged in user.
     * Update user
     * @param param the request object
     */
    public updateUser(param: UserApiUpdateUserRequest = {}, options?: Configuration): Promise<void> {
        return this.api.updateUser(param.updateUserRequest,  options).toPromise();
    }

}
