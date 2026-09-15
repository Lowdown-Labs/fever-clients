
# ApiKey


## Properties

Name | Type
------------ | -------------
`createdAt` | string
`customerId` | string
`id` | number
`name` | string
`revoked` | boolean
`role` | string

## Example

```typescript
import type { ApiKey } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "createdAt": null,
  "customerId": null,
  "id": null,
  "name": null,
  "revoked": null,
  "role": null,
} satisfies ApiKey

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ApiKey
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


