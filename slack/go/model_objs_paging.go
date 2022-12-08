/*
Slack Web API

One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

API version: 1.7.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package slack

import (
	"encoding/json"
)

// ObjsPaging struct for ObjsPaging
type ObjsPaging struct {
	Count *int32 `json:"count,omitempty"`
	Page int32 `json:"page"`
	Pages *int32 `json:"pages,omitempty"`
	PerPage *int32 `json:"per_page,omitempty"`
	Spill *int32 `json:"spill,omitempty"`
	Total int32 `json:"total"`
}

// NewObjsPaging instantiates a new ObjsPaging object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewObjsPaging(page int32, total int32) *ObjsPaging {
	this := ObjsPaging{}
	this.Page = page
	this.Total = total
	return &this
}

// NewObjsPagingWithDefaults instantiates a new ObjsPaging object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewObjsPagingWithDefaults() *ObjsPaging {
	this := ObjsPaging{}
	return &this
}

// GetCount returns the Count field value if set, zero value otherwise.
func (o *ObjsPaging) GetCount() int32 {
	if o == nil || isNil(o.Count) {
		var ret int32
		return ret
	}
	return *o.Count
}

// GetCountOk returns a tuple with the Count field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjsPaging) GetCountOk() (*int32, bool) {
	if o == nil || isNil(o.Count) {
    return nil, false
	}
	return o.Count, true
}

// HasCount returns a boolean if a field has been set.
func (o *ObjsPaging) HasCount() bool {
	if o != nil && !isNil(o.Count) {
		return true
	}

	return false
}

// SetCount gets a reference to the given int32 and assigns it to the Count field.
func (o *ObjsPaging) SetCount(v int32) {
	o.Count = &v
}

// GetPage returns the Page field value
func (o *ObjsPaging) GetPage() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Page
}

// GetPageOk returns a tuple with the Page field value
// and a boolean to check if the value has been set.
func (o *ObjsPaging) GetPageOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Page, true
}

// SetPage sets field value
func (o *ObjsPaging) SetPage(v int32) {
	o.Page = v
}

// GetPages returns the Pages field value if set, zero value otherwise.
func (o *ObjsPaging) GetPages() int32 {
	if o == nil || isNil(o.Pages) {
		var ret int32
		return ret
	}
	return *o.Pages
}

// GetPagesOk returns a tuple with the Pages field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjsPaging) GetPagesOk() (*int32, bool) {
	if o == nil || isNil(o.Pages) {
    return nil, false
	}
	return o.Pages, true
}

// HasPages returns a boolean if a field has been set.
func (o *ObjsPaging) HasPages() bool {
	if o != nil && !isNil(o.Pages) {
		return true
	}

	return false
}

// SetPages gets a reference to the given int32 and assigns it to the Pages field.
func (o *ObjsPaging) SetPages(v int32) {
	o.Pages = &v
}

// GetPerPage returns the PerPage field value if set, zero value otherwise.
func (o *ObjsPaging) GetPerPage() int32 {
	if o == nil || isNil(o.PerPage) {
		var ret int32
		return ret
	}
	return *o.PerPage
}

// GetPerPageOk returns a tuple with the PerPage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjsPaging) GetPerPageOk() (*int32, bool) {
	if o == nil || isNil(o.PerPage) {
    return nil, false
	}
	return o.PerPage, true
}

// HasPerPage returns a boolean if a field has been set.
func (o *ObjsPaging) HasPerPage() bool {
	if o != nil && !isNil(o.PerPage) {
		return true
	}

	return false
}

// SetPerPage gets a reference to the given int32 and assigns it to the PerPage field.
func (o *ObjsPaging) SetPerPage(v int32) {
	o.PerPage = &v
}

// GetSpill returns the Spill field value if set, zero value otherwise.
func (o *ObjsPaging) GetSpill() int32 {
	if o == nil || isNil(o.Spill) {
		var ret int32
		return ret
	}
	return *o.Spill
}

// GetSpillOk returns a tuple with the Spill field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjsPaging) GetSpillOk() (*int32, bool) {
	if o == nil || isNil(o.Spill) {
    return nil, false
	}
	return o.Spill, true
}

// HasSpill returns a boolean if a field has been set.
func (o *ObjsPaging) HasSpill() bool {
	if o != nil && !isNil(o.Spill) {
		return true
	}

	return false
}

// SetSpill gets a reference to the given int32 and assigns it to the Spill field.
func (o *ObjsPaging) SetSpill(v int32) {
	o.Spill = &v
}

// GetTotal returns the Total field value
func (o *ObjsPaging) GetTotal() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Total
}

// GetTotalOk returns a tuple with the Total field value
// and a boolean to check if the value has been set.
func (o *ObjsPaging) GetTotalOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Total, true
}

// SetTotal sets field value
func (o *ObjsPaging) SetTotal(v int32) {
	o.Total = v
}

func (o ObjsPaging) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Count) {
		toSerialize["count"] = o.Count
	}
	if true {
		toSerialize["page"] = o.Page
	}
	if !isNil(o.Pages) {
		toSerialize["pages"] = o.Pages
	}
	if !isNil(o.PerPage) {
		toSerialize["per_page"] = o.PerPage
	}
	if !isNil(o.Spill) {
		toSerialize["spill"] = o.Spill
	}
	if true {
		toSerialize["total"] = o.Total
	}
	return json.Marshal(toSerialize)
}

type NullableObjsPaging struct {
	value *ObjsPaging
	isSet bool
}

func (v NullableObjsPaging) Get() *ObjsPaging {
	return v.value
}

func (v *NullableObjsPaging) Set(val *ObjsPaging) {
	v.value = val
	v.isSet = true
}

func (v NullableObjsPaging) IsSet() bool {
	return v.isSet
}

func (v *NullableObjsPaging) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObjsPaging(val *ObjsPaging) *NullableObjsPaging {
	return &NullableObjsPaging{value: val, isSet: true}
}

func (v NullableObjsPaging) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObjsPaging) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


