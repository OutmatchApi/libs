import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ApiApp } from '../models/ApiApp';
import { ApiAppRequest } from '../models/ApiAppRequest';
import { Language } from '../models/Language';
import { Logo } from '../models/Logo';
import { ModelError } from '../models/ModelError';
import { Release } from '../models/Release';
import { Sdk } from '../models/Sdk';
import { SdkRequest } from '../models/SdkRequest';
import { SdkResponse } from '../models/SdkResponse';
import { Spec } from '../models/Spec';
import { Status } from '../models/Status';
import { User } from '../models/User';
import { UserPostRequest } from '../models/UserPostRequest';
import { UserPutRequest } from '../models/UserPutRequest';

import { ObservableApiAppApi } from "./ObservableAPI";
import { ApiAppApiRequestFactory, ApiAppApiResponseProcessor} from "../apis/ApiAppApi";

export interface ApiAppApiCreateApiAppRequest {
    /**
     * Created api app object
     * @type ApiAppRequest
     * @memberof ApiAppApicreateApiApp
     */
    apiAppRequest?: ApiAppRequest
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
     * Created sdks objects
     * @type SdkRequest
     * @memberof ApiAppApicreateApiAppReleaseSdks
     */
    sdkRequest?: SdkRequest
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
        return this.api.createApiApp(param.apiAppRequest,  options).toPromise();
    }

    /**
     * Create an api app release
     * Create api app release
     * @param param the request object
     */
    public createApiAppRelease(param: ApiAppApiCreateApiAppReleaseRequest, options?: Configuration): Promise<void> {
        return this.api.createApiAppRelease(param.appId, param.body,  options).toPromise();
    }

    /**
     * Generate sdks for a relase
     * Generate sdks for a relase
     * @param param the request object
     */
    public createApiAppReleaseSdks(param: ApiAppApiCreateApiAppReleaseSdksRequest, options?: Configuration): Promise<void> {
        return this.api.createApiAppReleaseSdks(param.appId, param.releaseVersion, param.sdkRequest,  options).toPromise();
    }

}

import { ObservableStatusApi } from "./ObservableAPI";
import { StatusApiRequestFactory, StatusApiResponseProcessor} from "../apis/StatusApi";

export interface StatusApiStatusGetRequest {
}

export class ObjectStatusApi {
    private api: ObservableStatusApi

    public constructor(configuration: Configuration, requestFactory?: StatusApiRequestFactory, responseProcessor?: StatusApiResponseProcessor) {
        this.api = new ObservableStatusApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public statusGet(param: StatusApiStatusGetRequest = {}, options?: Configuration): Promise<void> {
        return this.api.statusGet( options).toPromise();
    }

}

import { ObservableUserApi } from "./ObservableAPI";
import { UserApiRequestFactory, UserApiResponseProcessor} from "../apis/UserApi";

export interface UserApiCreateUserRequest {
    /**
     * Created user object
     * @type UserPostRequest
     * @memberof UserApicreateUser
     */
    userPostRequest?: UserPostRequest
}

export interface UserApiUpdateUserRequest {
    /**
     * Update an existent user in the store
     * @type UserPutRequest
     * @memberof UserApiupdateUser
     */
    userPutRequest?: UserPutRequest
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
        return this.api.createUser(param.userPostRequest,  options).toPromise();
    }

    /**
     * This can only be done by the logged in user.
     * Update user
     * @param param the request object
     */
    public updateUser(param: UserApiUpdateUserRequest = {}, options?: Configuration): Promise<void> {
        return this.api.updateUser(param.userPutRequest,  options).toPromise();
    }

}
