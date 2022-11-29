# svix::EventTypeIn

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** |  |  |
| **schemas** | **Hash&lt;String, Object&gt;** | The schema for the event type for a specific version as a JSON schema. | [optional] |
| **archived** | **Boolean** |  | [optional][default to false] |
| **name** | **String** |  |  |

## Example

```ruby
require 'svix'

instance = svix::EventTypeIn.new(
  description: A user has signed up,
  schemas: {&quot;1&quot;:{&quot;title&quot;:&quot;Invoice Paid Event&quot;,&quot;description&quot;:&quot;An invoice was paid by a user&quot;,&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;invoiceId&quot;:{&quot;description&quot;:&quot;The invoice id&quot;,&quot;type&quot;:&quot;string&quot;},&quot;userId&quot;:{&quot;description&quot;:&quot;The user id&quot;,&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;invoiceId&quot;,&quot;userId&quot;]}},
  archived: false,
  name: user.signup
)
```

