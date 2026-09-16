package fever

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func Test_fever_QueryAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test QueryAPIService Query", func(t *testing.T) {

		t.Skip("skip test")

		resp, httpRes, err := apiClient.QueryAPI.Query(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
