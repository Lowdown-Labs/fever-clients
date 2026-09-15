
# IngestMedia


## Properties

Name | Type
------------ | -------------
`caption` | string
`customerId` | string
`data` | string
`metadata` | { [key: string]: any; }
`stripExif` | boolean
`tags` | Array&lt;string&gt;
`url` | string

## Example

```typescript
import type { IngestMedia } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "caption": null,
  "customerId": null,
  "data": null,
  "metadata": null,
  "stripExif": null,
  "tags": null,
  "url": null,
} satisfies IngestMedia

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IngestMedia
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


