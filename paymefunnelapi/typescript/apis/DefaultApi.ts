// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { FunnelMetadataPublic } from '../models/FunnelMetadataPublic';

/**
 * no description
 */
export class DefaultApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Get funnel by id
     * 
     * @param funnelId The funnel id
     * @param sessionId The payment session id
     */
    public async getFunnel(funnelId: string, sessionId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'funnelId' is not null or undefined
        if (funnelId === null || funnelId === undefined) {
            throw new RequiredError("DefaultApi", "getFunnel", "funnelId");
        }



        // Path Params
        const localVarPath = '/funnel/{funnel_id}'
            .replace('{' + 'funnel_id' + '}', encodeURIComponent(String(funnelId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (sessionId !== undefined) {
            requestContext.setQueryParam("session_id", ObjectSerializer.serialize(sessionId, "string", ""));
        }


        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class DefaultApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getFunnel
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getFunnel(response: ResponseContext): Promise<FunnelMetadataPublic > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: FunnelMetadataPublic = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "FunnelMetadataPublic", ""
            ) as FunnelMetadataPublic;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: FunnelMetadataPublic = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "FunnelMetadataPublic", ""
            ) as FunnelMetadataPublic;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
