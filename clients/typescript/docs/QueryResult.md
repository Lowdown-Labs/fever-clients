
# QueryResult


## Properties

Name | Type
------------ | -------------
`columns` | Array&lt;string&gt;
`rows` | Array&lt;Array&lt;any&gt;&gt;
`truncated` | boolean

## Example

```typescript
import type { QueryResult } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "columns": null,
  "rows": null,
  "truncated": null,
} satisfies QueryResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as QueryResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


