
# MediaInfo


## Properties

Name | Type
------------ | -------------
`attachments` | [Array&lt;MediaAttachment&gt;](MediaAttachment.md)
`blobId` | number
`caption` | string
`capturedAt` | Date
`collectionId` | string
`customerId` | string
`device` | string
`externalRef` | string
`frameCount` | number
`gpsLat` | number
`gpsLon` | number
`kind` | string
`metadata` | { [key: string]: any; }
`ocrText` | string
`parentRef` | string
`synthetic` | number
`tags` | Array&lt;string&gt;
`transcriptSegments` | number

## Example

```typescript
import type { MediaInfo } from 'fever-client'

// TODO: Update the object below with actual values
const example = {
  "attachments": null,
  "blobId": null,
  "caption": null,
  "capturedAt": null,
  "collectionId": null,
  "customerId": null,
  "device": null,
  "externalRef": null,
  "frameCount": null,
  "gpsLat": null,
  "gpsLon": null,
  "kind": null,
  "metadata": null,
  "ocrText": null,
  "parentRef": null,
  "synthetic": null,
  "tags": null,
  "transcriptSegments": null,
} satisfies MediaInfo

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MediaInfo
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


