# apivideo.model.pagination.Pagination

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[links](#links)** | list, tuple,  | tuple,  |  | 
**currentPage** | decimal.Decimal, int,  | decimal.Decimal,  | The current page index. | [optional] 
**currentPageItems** | decimal.Decimal, int,  | decimal.Decimal,  | The number of items on the current page. | [optional] 
**itemsTotal** | decimal.Decimal, int,  | decimal.Decimal,  | Total number of items that exist. | [optional] 
**pageSize** | decimal.Decimal, int,  | decimal.Decimal,  | Maximum number of item per page. | [optional] 
**pagesTotal** | decimal.Decimal, int,  | decimal.Decimal,  | Number of items listed in the current page. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# links

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**PaginationLink**](PaginationLink.md) | [**PaginationLink**](PaginationLink.md) | [**PaginationLink**](PaginationLink.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

