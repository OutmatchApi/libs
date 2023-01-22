import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { Asset } from '../models/Asset';
import { CreateUserRequest } from '../models/CreateUserRequest';
import { Funnel } from '../models/Funnel';
import { FunnelCreate400Response } from '../models/FunnelCreate400Response';
import { FunnelCreateRequest } from '../models/FunnelCreateRequest';
import { FunnelMetadata } from '../models/FunnelMetadata';
import { FunnelMetadataPublic } from '../models/FunnelMetadataPublic';
import { ModelError } from '../models/ModelError';
import { PublicAssert } from '../models/PublicAssert';
import { StripeAccount } from '../models/StripeAccount';
import { StripeIntegration } from '../models/StripeIntegration';
import { StripeLinkedAccount } from '../models/StripeLinkedAccount';
import { UpdateUserRequest } from '../models/UpdateUserRequest';
import { User } from '../models/User';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiGetFunnelRequest {
    /**
     * the funnel id
     * @type string
     * @memberof DefaultApigetFunnel
     */
    funnelId: string
    /**
     * The payment session id
     * @type string
     * @memberof DefaultApigetFunnel
     */
    sessionId?: string
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get funnel by id
     * 
     * @param param the request object
     */
    public getFunnel(param: DefaultApiGetFunnelRequest, options?: Configuration): Promise<FunnelMetadataPublic> {
        return this.api.getFunnel(param.funnelId, param.sessionId,  options).toPromise();
    }

}

import { ObservableFunnelApi } from "./ObservableAPI";
import { FunnelApiRequestFactory, FunnelApiResponseProcessor} from "../apis/FunnelApi";

export interface FunnelApiFunnelCreateRequest {
    /**
     * 
     * @type FunnelCreateRequest
     * @memberof FunnelApifunnelCreate
     */
    funnelCreateRequest?: FunnelCreateRequest
}

export class ObjectFunnelApi {
    private api: ObservableFunnelApi

    public constructor(configuration: Configuration, requestFactory?: FunnelApiRequestFactory, responseProcessor?: FunnelApiResponseProcessor) {
        this.api = new ObservableFunnelApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * create a new funnel
     * 
     * @param param the request object
     */
    public funnelCreate(param: FunnelApiFunnelCreateRequest = {}, options?: Configuration): Promise<Funnel> {
        return this.api.funnelCreate(param.funnelCreateRequest,  options).toPromise();
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

export interface UserApiUserConnectStripeRequest {
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

    /**
     * This can only be done by the logged in user.
     * Update user's stripe account
     * @param param the request object
     */
    public userConnectStripe(param: UserApiUserConnectStripeRequest = {}, options?: Configuration): Promise<StripeLinkedAccount> {
        return this.api.userConnectStripe( options).toPromise();
    }

}
