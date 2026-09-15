
# IngestResult


## Properties

Name | Type
------------ | -------------
`existing` | [Array&lt;IngestedMedia&gt;](IngestedMedia.md)
`ingested` | [Array&lt;IngestedMedia&gt;](IngestedMedia.md)
`job` | [Job](Job.md)

## Example

```typescript
import type { IngestResult } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "existing": null,
  "ingested": null,
  "job": null,
} satisfies IngestResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IngestResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


