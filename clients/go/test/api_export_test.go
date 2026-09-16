package fever

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func Test_fever_ExportAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test ExportAPIService ExportTenant", func(t *testing.T) {

		t.Skip("skip test")

		resp, httpRes, err := apiClient.ExportAPI.ExportTenant(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test ExportAPIService ImportTenant", func(t *testing.T) {

		t.Skip("skip test")

		resp, httpRes, err := apiClient.ExportAPI.ImportTenant(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
