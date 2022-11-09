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

import ApiClient from '../ApiClient';
import Language from './Language';

/**
 * The Sdk model module.
 * @module model/Sdk
 * @version 0.0.3
 */
class Sdk {
    /**
     * Constructs a new <code>Sdk</code>.
     * @alias module:model/Sdk
     */
    constructor() { 
        
        Sdk.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Sdk</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Sdk} obj Optional instance to populate.
     * @return {module:model/Sdk} The populated <code>Sdk</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Sdk();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('language')) {
                obj['language'] = Language.constructFromObject(data['language']);
            }
            if (data.hasOwnProperty('sdkVersion')) {
                obj['sdkVersion'] = ApiClient.convertToType(data['sdkVersion'], 'String');
            }
            if (data.hasOwnProperty('codeUrl')) {
                obj['codeUrl'] = ApiClient.convertToType(data['codeUrl'], 'String');
            }
            if (data.hasOwnProperty('packageUrl')) {
                obj['packageUrl'] = ApiClient.convertToType(data['packageUrl'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Sdk</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Sdk</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['sdkVersion'] && !(typeof data['sdkVersion'] === 'string' || data['sdkVersion'] instanceof String)) {
            throw new Error("Expected the field `sdkVersion` to be a primitive type in the JSON string but got " + data['sdkVersion']);
        }
        // ensure the json data is a string
        if (data['codeUrl'] && !(typeof data['codeUrl'] === 'string' || data['codeUrl'] instanceof String)) {
            throw new Error("Expected the field `codeUrl` to be a primitive type in the JSON string but got " + data['codeUrl']);
        }
        // ensure the json data is a string
        if (data['packageUrl'] && !(typeof data['packageUrl'] === 'string' || data['packageUrl'] instanceof String)) {
            throw new Error("Expected the field `packageUrl` to be a primitive type in the JSON string but got " + data['packageUrl']);
        }

        return true;
    }


}



/**
 * @member {String} id
 */
Sdk.prototype['id'] = undefined;

/**
 * @member {module:model/Language} language
 */
Sdk.prototype['language'] = undefined;

/**
 * @member {String} sdkVersion
 */
Sdk.prototype['sdkVersion'] = undefined;

/**
 * @member {String} codeUrl
 */
Sdk.prototype['codeUrl'] = undefined;

/**
 * @member {String} packageUrl
 */
Sdk.prototype['packageUrl'] = undefined;






export default Sdk;

