# \MediaAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AssociateMedia**](MediaAPI.md#AssociateMedia) | **Post** /v1/media/{blob_id}/associate | Set a blob&#39;s collection and/or parent association (e.g. attach a LiDAR scan to its source photo)
[**GetMediaBytes**](MediaAPI.md#GetMediaBytes) | **Get** /v1/media/{blob_id}/bytes | Fetch an indexed media item&#39;s bytes (images normalized to JPEG)
[**GetMediaInfo**](MediaAPI.md#GetMediaInfo) | **Get** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts
[**ListMediaFormats**](MediaAPI.md#ListMediaFormats) | **Get** /v1/media/formats | Ingest capability: supported extensions per media family
[**ListMediaFrames**](MediaAPI.md#ListMediaFrames) | **Get** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob
[**ListMediaTranscript**](MediaAPI.md#ListMediaTranscript) | **Get** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video)



## AssociateMedia

> MediaInfo AssociateMedia(ctx, blobId).AssociateRequest(associateRequest).CustomerId(customerId).Execute()

Set a blob's collection and/or parent association (e.g. attach a LiDAR scan to its source photo)



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
	associateRequest := *openapiclient.NewAssociateRequest() // AssociateRequest | 
	customerId := "customerId_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaAPI.AssociateMedia(context.Background(), blobId).AssociateRequest(associateRequest).CustomerId(customerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MediaAPI.AssociateMedia``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AssociateMedia`: MediaInfo
	fmt.Fprintf(os.Stdout, "Response from `MediaAPI.AssociateMedia`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**blobId** | **int32** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiAssociateMediaRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **associateRequest** | [**AssociateRequest**](AssociateRequest.md) |  | 
 **customerId** | **string** |  | 

### Return type

[**MediaInfo**](MediaInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMediaBytes

> interface{} GetMediaBytes(ctx, blobId).MaxDim(maxDim).Waveform(waveform).Execute()

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaAPI.GetMediaBytes(context.Background(), blobId).MaxDim(maxDim).Waveform(waveform).Execute()
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

### Return type

**interface{}**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, image/jpeg, image/png

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMediaInfo

> MediaInfo GetMediaInfo(ctx, blobId).CustomerId(customerId).Execute()

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaAPI.GetMediaInfo(context.Background(), blobId).CustomerId(customerId).Execute()
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

### Return type

[**MediaInfo**](MediaInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListMediaFormats

> MediaFormats ListMediaFormats(ctx).Execute()

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaAPI.ListMediaFormats(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MediaAPI.ListMediaFormats``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListMediaFormats`: MediaFormats
	fmt.Fprintf(os.Stdout, "Response from `MediaAPI.ListMediaFormats`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiListMediaFormatsRequest struct via the builder pattern


### Return type

[**MediaFormats**](MediaFormats.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListMediaFrames

> []MediaFrame ListMediaFrames(ctx, blobId).CustomerId(customerId).Execute()

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaAPI.ListMediaFrames(context.Background(), blobId).CustomerId(customerId).Execute()
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

### Return type

[**[]MediaFrame**](MediaFrame.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListMediaTranscript

> []TranscriptSegment ListMediaTranscript(ctx, blobId).CustomerId(customerId).Execute()

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MediaAPI.ListMediaTranscript(context.Background(), blobId).CustomerId(customerId).Execute()
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

### Return type

[**[]TranscriptSegment**](TranscriptSegment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

