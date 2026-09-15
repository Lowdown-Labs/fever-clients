
# IngestSource


## Properties

Name | Type
------------ | -------------
`customerId` | string
`s3Uri` | string
`targetRes` | number

## Example

```typescript
import type { IngestSource } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "customerId": null,
  "s3Uri": null,
  "targetRes": null,
} satisfies IngestSource

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IngestSource
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


