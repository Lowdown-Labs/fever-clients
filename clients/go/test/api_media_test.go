package fever

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func Test_fever_MediaAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test MediaAPIService GetMediaBytes", func(t *testing.T) {

		t.Skip("skip test")

		var blobId int32

		resp, httpRes, err := apiClient.MediaAPI.GetMediaBytes(context.Background(), blobId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MediaAPIService GetMediaInfo", func(t *testing.T) {

		t.Skip("skip test")

		var blobId int32

		resp, httpRes, err := apiClient.MediaAPI.GetMediaInfo(context.Background(), blobId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MediaAPIService ListMediaFormats", func(t *testing.T) {

		t.Skip("skip test")

		resp, httpRes, err := apiClient.MediaAPI.ListMediaFormats(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MediaAPIService ListMediaFrames", func(t *testing.T) {

		t.Skip("skip test")

		var blobId int32

		resp, httpRes, err := apiClient.MediaAPI.ListMediaFrames(context.Background(), blobId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MediaAPIService ListMediaTranscript", func(t *testing.T) {

		t.Skip("skip test")

		var blobId int32

		resp, httpRes, err := apiClient.MediaAPI.ListMediaTranscript(context.Background(), blobId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
