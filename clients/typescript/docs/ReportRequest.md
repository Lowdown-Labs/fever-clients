
# ReportRequest


## Properties

Name | Type
------------ | -------------
`customerId` | string
`outputS3Uri` | string
`slots` | [Array&lt;ReportSlot&gt;](ReportSlot.md)
`title` | string

## Example

```typescript
import type { ReportRequest } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "customerId": null,
  "outputS3Uri": null,
  "slots": null,
  "title": null,
} satisfies ReportRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ReportRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


