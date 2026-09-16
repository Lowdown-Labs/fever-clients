package fever

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func Test_fever_DuplicatesAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test DuplicatesAPIService FindDuplicates", func(t *testing.T) {

		t.Skip("skip test")

		resp, httpRes, err := apiClient.DuplicatesAPI.FindDuplicates(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test DuplicatesAPIService SuggestedDedupThreshold", func(t *testing.T) {

		t.Skip("skip test")

		resp, httpRes, err := apiClient.DuplicatesAPI.SuggestedDedupThreshold(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
