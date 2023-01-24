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
import { PublicAsset } from '../models/PublicAsset';
import { StripeAccount } from '../models/StripeAccount';
import { StripeIntegration } from '../models/StripeIntegration';
import { StripeLinkedAccount } from '../models/StripeLinkedAccount';
import { UpdateUserRequest } from '../models/UpdateUserRequest';
import { User } from '../models/User';
import { UserPublic } from '../models/UserPublic';
import { ObservableFunnelApi } from './ObservableAPI';

import { FunnelApiRequestFactory, FunnelApiResponseProcessor} from "../apis/FunnelApi";
export class PromiseFunnelApi {
    private api: ObservableFunnelApi

    public constructor(
        configuration: Configuration,
        requestFactory?: FunnelApiRequestFactory,
        responseProcessor?: FunnelApiResponseProcessor
    ) {
        this.api = new ObservableFunnelApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * create a new funnel
     * 
     * @param funnelCreateRequest 
     */
    public funnelCreate(funnelCreateRequest?: FunnelCreateRequest, _options?: Configuration): Promise<Funnel> {
        const result = this.api.funnelCreate(funnelCreateRequest, _options);
        return result.toPromise();
    }


}



import { ObservablePublicFunnelApi } from './ObservableAPI';

import { PublicFunnelApiRequestFactory, PublicFunnelApiResponseProcessor} from "../apis/PublicFunnelApi";
export class PromisePublicFunnelApi {
    private api: ObservablePublicFunnelApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PublicFunnelApiRequestFactory,
        responseProcessor?: PublicFunnelApiResponseProcessor
    ) {
        this.api = new ObservablePublicFunnelApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get funnel by id
     * Publicly get funnel
     * @param funnelId the funnel id
     * @param sessionId The payment session id
     */
    public getFunnel(funnelId: string, sessionId?: string, _options?: Configuration): Promise<FunnelMetadataPublic> {
        const result = this.api.getFunnel(funnelId, sessionId, _options);
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

    /**
     * This can only be done by the logged in user.
     * Update user's stripe account
     */
    public userConnectStripe(_options?: Configuration): Promise<StripeLinkedAccount> {
        const result = this.api.userConnectStripe(_options);
        return result.toPromise();
    }


}



