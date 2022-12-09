# video-api::Pagination

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **current_page** | **Integer** | The current page index. | [optional][readonly] |
| **current_page_items** | **Integer** | The number of items on the current page. | [optional][readonly] |
| **items_total** | **Integer** | Total number of items that exist. | [optional][readonly] |
| **links** | [**Array&lt;PaginationLink&gt;**](PaginationLink.md) |  |  |
| **page_size** | **Integer** | Maximum number of item per page. | [optional][readonly] |
| **pages_total** | **Integer** | Number of items listed in the current page. | [optional][readonly] |

## Example

```ruby
require 'video-api'

instance = video-api::Pagination.new(
  current_page: null,
  current_page_items: null,
  items_total: null,
  links: null,
  page_size: null,
  pages_total: null
)
```

