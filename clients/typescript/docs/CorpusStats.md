
# CorpusStats


## Properties

Name | Type
------------ | -------------
`indexBytes` | number
`kinds` | { [key: string]: number; }
`storageBytes` | number
`topTags` | [Array&lt;CorpusTag&gt;](CorpusTag.md)

## Example

```typescript
import type { CorpusStats } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "indexBytes": null,
  "kinds": null,
  "storageBytes": null,
  "topTags": null,
} satisfies CorpusStats

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CorpusStats
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


