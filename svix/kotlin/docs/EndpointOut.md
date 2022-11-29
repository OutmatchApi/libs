
# EndpointOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**version** | **kotlin.Int** |  | 
**id** | **kotlin.String** |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**uid** | **kotlin.String** | Optional unique identifier for the endpoint |  [optional]
**description** | **kotlin.String** |  |  [optional]
**filterTypes** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  |  [optional]
**channels** | **kotlin.collections.Set&lt;kotlin.String&gt;** | List of message channels this endpoint listens to (omit for all) |  [optional]
**disabled** | **kotlin.Boolean** |  |  [optional]
**rateLimit** | **kotlin.Int** |  |  [optional]
**metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional]



