# \MediaAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetMediaBytes**](MediaAPI.md#GetMediaBytes) | **Get** /v1/media/{blob_id}/bytes | Fetch an indexed media item&#39;s bytes (images normalized to JPEG)
[**GetMediaInfo**](MediaAPI.md#GetMediaInfo) | **Get** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts
[**ListMediaFormats**](MediaAPI.md#ListMediaFormats) | **Get** /v1/media/formats | Ingest capability: supported extensions per media family
[**ListMediaFrames**](MediaAPI.md#ListMediaFrames) | **Get** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob
[**ListMediaTranscript**](MediaAPI.md#ListMediaTranscript) | **Get** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video)



## GetMediaBytes

> interface{} GetMediaBytes(ctx, blobId).MaxDim(maxDim).Waveform(waveform).Authorization(authorization).Execute()

Fetch an indexed media item's bytes (images normalized to JPEG)



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	blobId := int32(56) // int32 | 
	maxDim := int32(56) // int32 |  (optional) (default to 1280)
	waveform := int32(56) // int32 |  (optional) (default to 0)
	authorization := "authorization_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaAPI.GetMediaBytes(context.Background(), blobId).MaxDim(maxDim).Waveform(waveform).Authorization(authorization).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MediaAPI.GetMediaBytes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetMediaBytes`: interface{}
	fmt.Fprintf(os.Stdout, "Response from `MediaAPI.GetMediaBytes`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**blobId** | **int32** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetMediaBytesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **maxDim** | **int32** |  | [default to 1280]
 **waveform** | **int32** |  | [default to 0]
 **authorization** | **string** |  | 

### Return type

**interface{}**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, image/jpeg, image/png

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMediaInfo

> MediaInfo GetMediaInfo(ctx, blobId).CustomerId(customerId).Authorization(authorization).Execute()

Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	blobId := int32(56) // int32 | 
	customerId := "customerId_example" // string |  (optional)
	authorization := "authorization_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaAPI.GetMediaInfo(context.Background(), blobId).CustomerId(customerId).Authorization(authorization).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MediaAPI.GetMediaInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetMediaInfo`: MediaInfo
	fmt.Fprintf(os.Stdout, "Response from `MediaAPI.GetMediaInfo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**blobId** | **int32** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetMediaInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **customerId** | **string** |  | 
 **authorization** | **string** |  | 

### Return type

[**MediaInfo**](MediaInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListMediaFormats

> MediaFormats ListMediaFormats(ctx).Authorization(authorization).Execute()

Ingest capability: supported extensions per media family

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	authorization := "authorization_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaAPI.ListMediaFormats(context.Background()).Authorization(authorization).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MediaAPI.ListMediaFormats``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListMediaFormats`: MediaFormats
	fmt.Fprintf(os.Stdout, "Response from `MediaAPI.ListMediaFormats`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListMediaFormatsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | 

### Return type

[**MediaFormats**](MediaFormats.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListMediaFrames

> []MediaFrame ListMediaFrames(ctx, blobId).CustomerId(customerId).Authorization(authorization).Execute()

Sampled video frames for a parent blob

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	blobId := int32(56) // int32 | 
	customerId := "customerId_example" // string |  (optional)
	authorization := "authorization_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaAPI.ListMediaFrames(context.Background(), blobId).CustomerId(customerId).Authorization(authorization).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MediaAPI.ListMediaFrames``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListMediaFrames`: []MediaFrame
	fmt.Fprintf(os.Stdout, "Response from `MediaAPI.ListMediaFrames`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**blobId** | **int32** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListMediaFramesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **customerId** | **string** |  | 
 **authorization** | **string** |  | 

### Return type

[**[]MediaFrame**](MediaFrame.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListMediaTranscript

> []TranscriptSegment ListMediaTranscript(ctx, blobId).CustomerId(customerId).Authorization(authorization).Execute()

Whisper transcript segments for a parent blob (audio or video)

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	blobId := int32(56) // int32 | 
	customerId := "customerId_example" // string |  (optional)
	authorization := "authorization_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaAPI.ListMediaTranscript(context.Background(), blobId).CustomerId(customerId).Authorization(authorization).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MediaAPI.ListMediaTranscript``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListMediaTranscript`: []TranscriptSegment
	fmt.Fprintf(os.Stdout, "Response from `MediaAPI.ListMediaTranscript`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**blobId** | **int32** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListMediaTranscriptRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **customerId** | **string** |  | 
 **authorization** | **string** |  | 

### Return type

[**[]TranscriptSegment**](TranscriptSegment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

