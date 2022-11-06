import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

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
     * Created release object
     * @type ReleaseRequest
     * @memberof ApiAppApicreateApiAppRelease
     */
    releaseRequest?: ReleaseRequest
}

export interface ApiAppApiCreateApiAppReleaseSdksRequest {
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
    public createApiApp(param: ApiAppApiCreateApiAppRequest = {}, options?: Configuration): Promise<void> {
        return this.api.createApiApp(param.apiAppRequest,  options).toPromise();
    }

    /**
     * Create an api app release
     * Create api app release
     * @param param the request object
     */
    public createApiAppRelease(param: ApiAppApiCreateApiAppReleaseRequest = {}, options?: Configuration): Promise<void> {
        return this.api.createApiAppRelease(param.releaseRequest,  options).toPromise();
    }

    /**
     * Generate sdks for a relase
     * Generate sdks for a relase
     * @param param the request object
     */
    public createApiAppReleaseSdks(param: ApiAppApiCreateApiAppReleaseSdksRequest = {}, options?: Configuration): Promise<void> {
        return this.api.createApiAppReleaseSdks(param.sdkRequest,  options).toPromise();
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
     * name that need to be deleted
     * @type string
     * @memberof UserApiupdateUser
     */
    username: string
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
    public createUser(param: UserApiCreateUserRequest = {}, options?: Configuration): Promise<void> {
        return this.api.createUser(param.userPostRequest,  options).toPromise();
    }

    /**
     * This can only be done by the logged in user.
     * Update user
     * @param param the request object
     */
    public updateUser(param: UserApiUpdateUserRequest, options?: Configuration): Promise<void> {
        return this.api.updateUser(param.username, param.userPutRequest,  options).toPromise();
    }

}
