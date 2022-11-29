# api::StatusApi

All URIs are relative to *https://api.outmatchapi.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_status**](StatusApi.md#get_status) | **GET** /status |  |


## get_status

> get_status



Check the API status

### Examples

```ruby
require 'time'
require 'api'

api_instance = api::StatusApi.new

begin
  
  api_instance.get_status
rescue api::ApiError => e
  puts "Error when calling StatusApi->get_status: #{e}"
end
```

#### Using the get_status_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> get_status_with_http_info

```ruby
begin
  
  data, status_code, headers = api_instance.get_status_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue api::ApiError => e
  puts "Error when calling StatusApi->get_status_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

