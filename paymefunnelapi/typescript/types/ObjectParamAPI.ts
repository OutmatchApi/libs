import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { CreateUserRequest } from '../models/CreateUserRequest';
import { ModelError } from '../models/ModelError';
import { UpdateUserRequest } from '../models/UpdateUserRequest';
import { User } from '../models/User';

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
