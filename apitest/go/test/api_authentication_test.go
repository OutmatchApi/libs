/*
Svix API

Testing AuthenticationApiService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package apitest

import (
    "context"
    "github.com/stretchr/testify/assert"
    "github.com/stretchr/testify/require"
    "testing"
    openapiclient "./openapi"
)

func Test_apitest_AuthenticationApiService(t *testing.T) {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)

    t.Run("Test AuthenticationApiService GetDashboardAccessApiV1AuthDashboardAccessAppIdPost", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string

        resp, httpRes, err := apiClient.AuthenticationApi.GetDashboardAccessApiV1AuthDashboardAccessAppIdPost(context.Background(), appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test AuthenticationApiService LogoutApiV1AuthLogoutPost", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.AuthenticationApi.LogoutApiV1AuthLogoutPost(context.Background()).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}
