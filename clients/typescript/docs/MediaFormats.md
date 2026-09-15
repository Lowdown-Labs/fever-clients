
# MediaFormats


## Properties

Name | Type
------------ | -------------
`audio` | Array&lt;string&gt;
`document` | Array&lt;string&gt;
`image` | Array&lt;string&gt;
`video` | Array&lt;string&gt;

## Example

```typescript
import type { MediaFormats } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "audio": null,
  "document": null,
  "image": null,
  "video": null,
} satisfies MediaFormats

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MediaFormats
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


