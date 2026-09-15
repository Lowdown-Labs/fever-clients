
# IngestRequest


## Properties

Name | Type
------------ | -------------
`media` | [Array&lt;IngestMedia&gt;](IngestMedia.md)
`overwrite` | boolean
`source` | [IngestSource](IngestSource.md)
`targetRes` | number

## Example

```typescript
import type { IngestRequest } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "media": null,
  "overwrite": null,
  "source": null,
  "targetRes": null,
} satisfies IngestRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IngestRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


