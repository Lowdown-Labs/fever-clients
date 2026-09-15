
# ExportRequest


## Properties

Name | Type
------------ | -------------
`customerId` | string
`format` | string
`kind` | string
`s3Uri` | string
`tag` | string

## Example

```typescript
import type { ExportRequest } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "customerId": null,
  "format": null,
  "kind": null,
  "s3Uri": null,
  "tag": null,
} satisfies ExportRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ExportRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


