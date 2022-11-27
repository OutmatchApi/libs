/*
Outmatch API

Outmatch API

API version: 0.0.39
Contact: internal@outmatchapi.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package api

import (
	"encoding/json"
	"fmt"
)

// Language the model 'Language'
type Language string

// List of Language
const (
	LANGUAGE_GO Language = "go"
	LANGUAGE_TYPESCRIPT Language = "typescript"
)

// All allowed values of Language enum
var AllowedLanguageEnumValues = []Language{
	"go",
	"typescript",
}

func (v *Language) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := Language(value)
	for _, existing := range AllowedLanguageEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid Language", value)
}

// NewLanguageFromValue returns a pointer to a valid Language
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewLanguageFromValue(v string) (*Language, error) {
	ev := Language(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for Language: valid values are %v", v, AllowedLanguageEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v Language) IsValid() bool {
	for _, existing := range AllowedLanguageEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to Language value
func (v Language) Ptr() *Language {
	return &v
}

type NullableLanguage struct {
	value *Language
	isSet bool
}

func (v NullableLanguage) Get() *Language {
	return v.value
}

func (v *NullableLanguage) Set(val *Language) {
	v.value = val
	v.isSet = true
}

func (v NullableLanguage) IsSet() bool {
	return v.isSet
}

func (v *NullableLanguage) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLanguage(val *Language) *NullableLanguage {
	return &NullableLanguage{value: val, isSet: true}
}

func (v NullableLanguage) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLanguage) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

