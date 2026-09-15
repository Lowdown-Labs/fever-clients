
# SearchRequest


## Properties

Name | Type
------------ | -------------
`after` | string
`before` | string
`collapseDuplicates` | boolean
`customerId` | string
`device` | string
`dupeThreshold` | number
`excludeTags` | Array&lt;string&gt;
`image` | string
`imageBlobId` | number
`includeTags` | Array&lt;string&gt;
`indexedRes` | number
`k` | number
`kind` | string
`maxHeight` | number
`maxWidth` | number
`minScore` | number
`near` | Array&lt;number&gt;
`sort` | string
`text` | string

## Example

```typescript
import type { SearchRequest } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "after": null,
  "before": null,
  "collapseDuplicates": null,
  "customerId": null,
  "device": null,
  "dupeThreshold": null,
  "excludeTags": null,
  "image": null,
  "imageBlobId": null,
  "includeTags": null,
  "indexedRes": null,
  "k": null,
  "kind": null,
  "maxHeight": null,
  "maxWidth": null,
  "minScore": null,
  "near": null,
  "sort": null,
  "text": null,
} satisfies SearchRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SearchRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


