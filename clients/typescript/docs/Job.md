
# Job


## Properties

Name | Type
------------ | -------------
`done` | number
`error` | string
`id` | number
`skipped` | number
`status` | string
`total` | number

## Example

```typescript
import type { Job } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "done": null,
  "error": null,
  "id": null,
  "skipped": null,
  "status": null,
  "total": null,
} satisfies Job

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Job
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


