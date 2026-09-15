
# SearchHit


## Properties

Name | Type
------------ | -------------
`blobId` | number
`caption` | string
`customerId` | string
`duplicateCount` | number
`duplicates` | Array&lt;number&gt;
`geoLabel` | string
`headline` | string
`height` | number
`kind` | string
`mediaRef` | string
`metadata` | { [key: string]: any; }
`score` | number
`scoreType` | string
`seekMs` | number
`span` | [MediaSpan](MediaSpan.md)
`spanHeadline` | string
`tags` | Array&lt;string&gt;
`width` | number

## Example

```typescript
import type { SearchHit } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "blobId": null,
  "caption": null,
  "customerId": null,
  "duplicateCount": null,
  "duplicates": null,
  "geoLabel": null,
  "headline": null,
  "height": null,
  "kind": null,
  "mediaRef": null,
  "metadata": null,
  "score": null,
  "scoreType": null,
  "seekMs": null,
  "span": null,
  "spanHeadline": null,
  "tags": null,
  "width": null,
} satisfies SearchHit

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SearchHit
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


