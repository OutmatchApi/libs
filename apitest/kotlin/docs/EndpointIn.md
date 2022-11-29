
# EndpointIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**version** | **kotlin.Int** |  | 
**uid** | **kotlin.String** | Optional unique identifier for the endpoint |  [optional]
**description** | **kotlin.String** |  |  [optional]
**filterTypes** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  |  [optional]
**channels** | **kotlin.collections.Set&lt;kotlin.String&gt;** | List of message channels this endpoint listens to (omit for all) |  [optional]
**disabled** | **kotlin.Boolean** |  |  [optional]
**rateLimit** | **kotlin.Int** |  |  [optional]
**metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional]
**secret** | **kotlin.String** | The endpoint&#39;s verification secret. If &#x60;null&#x60; is passed, a secret is automatically generated. Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24. |  [optional]



