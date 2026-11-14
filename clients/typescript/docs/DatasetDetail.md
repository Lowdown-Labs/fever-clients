
# DatasetDetail


## Properties

Name | Type
------------ | -------------
`blobIds` | Array&lt;number&gt;
`createdAt` | string
`customerId` | string
`id` | number
`itemCount` | number
`name` | string
`sourceSql` | string

## Example

```typescript
import type { DatasetDetail } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "blobIds": null,
  "createdAt": null,
  "customerId": null,
  "id": null,
  "itemCount": null,
  "name": null,
  "sourceSql": null,
} satisfies DatasetDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DatasetDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


