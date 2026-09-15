
# DuplicatesRequest


## Properties

Name | Type
------------ | -------------
`customerId` | string
`customerIds` | Array&lt;string&gt;
`limit` | number
`threshold` | number

## Example

```typescript
import type { DuplicatesRequest } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "customerId": null,
  "customerIds": null,
  "limit": null,
  "threshold": null,
} satisfies DuplicatesRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DuplicatesRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


