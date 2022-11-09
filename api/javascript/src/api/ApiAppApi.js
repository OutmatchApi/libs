/**
 * Smooth API
 * Smooth API
 *
 * The version of the OpenAPI document: 0.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ApiApp from '../model/ApiApp';
import ApiAppRequest from '../model/ApiAppRequest';
import Release from '../model/Release';
import ReleaseRequest from '../model/ReleaseRequest';
import SdkRequest from '../model/SdkRequest';
import SdkResponse from '../model/SdkResponse';

/**
* ApiApp service.
* @module api/ApiAppApi
* @version 0.0.3
*/
export default class ApiAppApi {

    /**
    * Constructs a new ApiAppApi. 
    * @alias module:api/ApiAppApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the createApiApp operation.
     * @callback module:api/ApiAppApi~createApiAppCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ApiApp} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create api app
     * Create an api app for the authenticated user
     * @param {Object} opts Optional parameters
     * @param {module:model/ApiAppRequest} opts.apiAppRequest Created api app object
     * @param {module:api/ApiAppApi~createApiAppCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ApiApp}
     */
    createApiApp(opts, callback) {
      opts = opts || {};
      let postBody = opts['apiAppRequest'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = ApiApp;
      return this.apiClient.callApi(
        '/apiApp', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the createApiAppRelease operation.
     * @callback module:api/ApiAppApi~createApiAppReleaseCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Release} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create api app release
     * Create an api app release
     * @param {String} appId app id to associate the release with
     * @param {Object} opts Optional parameters
     * @param {module:model/ReleaseRequest} opts.releaseRequest Created release object
     * @param {module:api/ApiAppApi~createApiAppReleaseCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Release}
     */
    createApiAppRelease(appId, opts, callback) {
      opts = opts || {};
      let postBody = opts['releaseRequest'];
      // verify the required parameter 'appId' is set
      if (appId === undefined || appId === null) {
        throw new Error("Missing the required parameter 'appId' when calling createApiAppRelease");
      }

      let pathParams = {
        'app_id': appId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Release;
      return this.apiClient.callApi(
        '/apiApp/{app_id}/release', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the createApiAppReleaseSdks operation.
     * @callback module:api/ApiAppApi~createApiAppReleaseSdksCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SdkResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Generate sdks for a relase
     * Generate sdks for a relase
     * @param {String} appId app id
     * @param {String} releaseId release id
     * @param {Object} opts Optional parameters
     * @param {module:model/SdkRequest} opts.sdkRequest Created sdks objects
     * @param {module:api/ApiAppApi~createApiAppReleaseSdksCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SdkResponse}
     */
    createApiAppReleaseSdks(appId, releaseId, opts, callback) {
      opts = opts || {};
      let postBody = opts['sdkRequest'];
      // verify the required parameter 'appId' is set
      if (appId === undefined || appId === null) {
        throw new Error("Missing the required parameter 'appId' when calling createApiAppReleaseSdks");
      }
      // verify the required parameter 'releaseId' is set
      if (releaseId === undefined || releaseId === null) {
        throw new Error("Missing the required parameter 'releaseId' when calling createApiAppReleaseSdks");
      }

      let pathParams = {
        'app_id': appId,
        'release_id': releaseId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = SdkResponse;
      return this.apiClient.callApi(
        '/apiApp/{app_id}/release/{release_id}/sdk', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
