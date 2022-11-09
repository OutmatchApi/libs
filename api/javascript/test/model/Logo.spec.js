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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SmoothApi);
  }
}(this, function(expect, SmoothApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SmoothApi.Logo();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('Logo', function() {
    it('should create an instance of Logo', function() {
      // uncomment below and update the code to test Logo
      //var instance = new SmoothApi.Logo();
      //expect(instance).to.be.a(SmoothApi.Logo);
    });

    it('should have the property url (base name: "url")', function() {
      // uncomment below and update the code to test the property url
      //var instance = new SmoothApi.Logo();
      //expect(instance).to.be();
    });

    it('should have the property altText (base name: "altText")', function() {
      // uncomment below and update the code to test the property altText
      //var instance = new SmoothApi.Logo();
      //expect(instance).to.be();
    });

  });

}));
