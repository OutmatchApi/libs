# RawStatisticsListPlayerSessionEventsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**[]PlayerSessionEvent**](PlayerSessionEvent.md) |  | [optional] 
**Pagination** | Pointer to [**Pagination**](Pagination.md) |  | [optional] 

## Methods

### NewRawStatisticsListPlayerSessionEventsResponse

`func NewRawStatisticsListPlayerSessionEventsResponse() *RawStatisticsListPlayerSessionEventsResponse`

NewRawStatisticsListPlayerSessionEventsResponse instantiates a new RawStatisticsListPlayerSessionEventsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRawStatisticsListPlayerSessionEventsResponseWithDefaults

`func NewRawStatisticsListPlayerSessionEventsResponseWithDefaults() *RawStatisticsListPlayerSessionEventsResponse`

NewRawStatisticsListPlayerSessionEventsResponseWithDefaults instantiates a new RawStatisticsListPlayerSessionEventsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *RawStatisticsListPlayerSessionEventsResponse) GetData() []PlayerSessionEvent`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *RawStatisticsListPlayerSessionEventsResponse) GetDataOk() (*[]PlayerSessionEvent, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *RawStatisticsListPlayerSessionEventsResponse) SetData(v []PlayerSessionEvent)`

SetData sets Data field to given value.

### HasData

`func (o *RawStatisticsListPlayerSessionEventsResponse) HasData() bool`

HasData returns a boolean if a field has been set.

### GetPagination

`func (o *RawStatisticsListPlayerSessionEventsResponse) GetPagination() Pagination`

GetPagination returns the Pagination field if non-nil, zero value otherwise.

### GetPaginationOk

`func (o *RawStatisticsListPlayerSessionEventsResponse) GetPaginationOk() (*Pagination, bool)`

GetPaginationOk returns a tuple with the Pagination field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagination

`func (o *RawStatisticsListPlayerSessionEventsResponse) SetPagination(v Pagination)`

SetPagination sets Pagination field to given value.

### HasPagination

`func (o *RawStatisticsListPlayerSessionEventsResponse) HasPagination() bool`

HasPagination returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


