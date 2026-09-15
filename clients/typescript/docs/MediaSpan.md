
# MediaSpan

The transcript span that matched: where in the audio/video the hit is. Includes the literal segment text so the UI can highlight it.

## Properties

Name | Type
------------ | -------------
`endMs` | number
`startMs` | number
`text` | string

## Example

```typescript
import type { MediaSpan } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "endMs": null,
  "startMs": null,
  "text": null,
} satisfies MediaSpan

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MediaSpan
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


