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
     * @param apiAppRequest Created api app object
     */
    public createApiApp(apiAppRequest?: ApiAppRequest, _options?: Configuration): Promise<void> {
        const result = this.api.createApiApp(apiAppRequest, _options);
        return result.toPromise();
    }

    /**
     * Create an api app release
     * Create api app release
     * @param releaseRequest Created release object
     */
    public createApiAppRelease(releaseRequest?: ReleaseRequest, _options?: Configuration): Promise<void> {
        const result = this.api.createApiAppRelease(releaseRequest, _options);
        return result.toPromise();
    }

    /**
     * Generate sdks for a relase
     * Generate sdks for a relase
     * @param sdkRequest Created sdks objects
     */
    public createApiAppReleaseSdks(sdkRequest?: SdkRequest, _options?: Configuration): Promise<void> {
        const result = this.api.createApiAppReleaseSdks(sdkRequest, _options);
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
     * @param userPostRequest Created user object
     */
    public createUser(userPostRequest?: UserPostRequest, _options?: Configuration): Promise<void> {
        const result = this.api.createUser(userPostRequest, _options);
        return result.toPromise();
    }

    /**
     * This can only be done by the logged in user.
     * Update user
     * @param username name that need to be deleted
     * @param userPutRequest Update an existent user in the store
     */
    public updateUser(username: string, userPutRequest?: UserPutRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateUser(username, userPutRequest, _options);
        return result.toPromise();
    }


}



