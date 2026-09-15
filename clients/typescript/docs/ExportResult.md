
# ExportResult


## Properties

Name | Type
------------ | -------------
`exported` | number
`s3Uri` | string

## Example

```typescript
import type { ExportResult } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "exported": null,
  "s3Uri": null,
} satisfies ExportResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ExportResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


