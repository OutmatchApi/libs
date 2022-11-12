// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';



/**
 * no description
 */
export class SpecApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Download openapi spec
     * @param appId app id
     * @param releaseVersion release id
     */
    public async downloadSpec(appId: string, releaseVersion: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'appId' is not null or undefined
        if (appId === null || appId === undefined) {
            throw new RequiredError("SpecApi", "downloadSpec", "appId");
        }


        // verify required parameter 'releaseVersion' is not null or undefined
        if (releaseVersion === null || releaseVersion === undefined) {
            throw new RequiredError("SpecApi", "downloadSpec", "releaseVersion");
        }


        // Path Params
        const localVarPath = '/spec/{app_id}/release/{release_version}'
            .replace('{' + 'app_id' + '}', encodeURIComponent(String(appId)))
            .replace('{' + 'release_version' + '}', encodeURIComponent(String(releaseVersion)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class SpecApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to downloadSpec
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async downloadSpec(response: ResponseContext): Promise< void> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("0", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "successful operation", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            return;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
