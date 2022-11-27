/*
Outmatch API

Outmatch API

API version: 0.0.37
Contact: internal@outmatchapi.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// Sdk struct for Sdk
type Sdk struct {
	Id string `json:"id"`
	Language Language `json:"language"`
	SdkVersion string `json:"sdkVersion"`
	CodeUrl string `json:"codeUrl"`
	PackageUrl string `json:"packageUrl"`
	Status Status `json:"status"`
	Error string `json:"error"`
}

// NewSdk instantiates a new Sdk object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSdk(id string, language Language, sdkVersion string, codeUrl string, packageUrl string, status Status, error_ string) *Sdk {
	this := Sdk{}
	this.Id = id
	this.Language = language
	this.SdkVersion = sdkVersion
	this.CodeUrl = codeUrl
	this.PackageUrl = packageUrl
	this.Status = status
	this.Error = error_
	return &this
}

// NewSdkWithDefaults instantiates a new Sdk object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSdkWithDefaults() *Sdk {
	this := Sdk{}
	return &this
}

// GetId returns the Id field value
func (o *Sdk) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Sdk) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Sdk) SetId(v string) {
	o.Id = v
}

// GetLanguage returns the Language field value
func (o *Sdk) GetLanguage() Language {
	if o == nil {
		var ret Language
		return ret
	}

	return o.Language
}

// GetLanguageOk returns a tuple with the Language field value
// and a boolean to check if the value has been set.
func (o *Sdk) GetLanguageOk() (*Language, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Language, true
}

// SetLanguage sets field value
func (o *Sdk) SetLanguage(v Language) {
	o.Language = v
}

// GetSdkVersion returns the SdkVersion field value
func (o *Sdk) GetSdkVersion() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SdkVersion
}

// GetSdkVersionOk returns a tuple with the SdkVersion field value
// and a boolean to check if the value has been set.
func (o *Sdk) GetSdkVersionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.SdkVersion, true
}

// SetSdkVersion sets field value
func (o *Sdk) SetSdkVersion(v string) {
	o.SdkVersion = v
}

// GetCodeUrl returns the CodeUrl field value
func (o *Sdk) GetCodeUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CodeUrl
}

// GetCodeUrlOk returns a tuple with the CodeUrl field value
// and a boolean to check if the value has been set.
func (o *Sdk) GetCodeUrlOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.CodeUrl, true
}

// SetCodeUrl sets field value
func (o *Sdk) SetCodeUrl(v string) {
	o.CodeUrl = v
}

// GetPackageUrl returns the PackageUrl field value
func (o *Sdk) GetPackageUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.PackageUrl
}

// GetPackageUrlOk returns a tuple with the PackageUrl field value
// and a boolean to check if the value has been set.
func (o *Sdk) GetPackageUrlOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.PackageUrl, true
}

// SetPackageUrl sets field value
func (o *Sdk) SetPackageUrl(v string) {
	o.PackageUrl = v
}

// GetStatus returns the Status field value
func (o *Sdk) GetStatus() Status {
	if o == nil {
		var ret Status
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *Sdk) GetStatusOk() (*Status, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *Sdk) SetStatus(v Status) {
	o.Status = v
}

// GetError returns the Error field value
func (o *Sdk) GetError() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Error
}

// GetErrorOk returns a tuple with the Error field value
// and a boolean to check if the value has been set.
func (o *Sdk) GetErrorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Error, true
}

// SetError sets field value
func (o *Sdk) SetError(v string) {
	o.Error = v
}

func (o Sdk) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["language"] = o.Language
	}
	if true {
		toSerialize["sdkVersion"] = o.SdkVersion
	}
	if true {
		toSerialize["codeUrl"] = o.CodeUrl
	}
	if true {
		toSerialize["packageUrl"] = o.PackageUrl
	}
	if true {
		toSerialize["status"] = o.Status
	}
	if true {
		toSerialize["error"] = o.Error
	}
	return json.Marshal(toSerialize)
}

type NullableSdk struct {
	value *Sdk
	isSet bool
}

func (v NullableSdk) Get() *Sdk {
	return v.value
}

func (v *NullableSdk) Set(val *Sdk) {
	v.value = val
	v.isSet = true
}

func (v NullableSdk) IsSet() bool {
	return v.isSet
}

func (v *NullableSdk) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSdk(val *Sdk) *NullableSdk {
	return &NullableSdk{value: val, isSet: true}
}

func (v NullableSdk) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSdk) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


