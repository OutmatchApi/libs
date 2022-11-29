/*
Svix API

Testing IntegrationApiService

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

func Test_apitest_IntegrationApiService(t *testing.T) {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)

    t.Run("Test IntegrationApiService CreateIntegrationApiV1AppAppIdIntegrationPost", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string

        resp, httpRes, err := apiClient.IntegrationApi.CreateIntegrationApiV1AppAppIdIntegrationPost(context.Background(), appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test IntegrationApiService DeleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var integId string
        var appId string

        resp, httpRes, err := apiClient.IntegrationApi.DeleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(context.Background(), integId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test IntegrationApiService GetIntegrationApiV1AppAppIdIntegrationIntegIdGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var integId string
        var appId string

        resp, httpRes, err := apiClient.IntegrationApi.GetIntegrationApiV1AppAppIdIntegrationIntegIdGet(context.Background(), integId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test IntegrationApiService GetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var integId string
        var appId string

        resp, httpRes, err := apiClient.IntegrationApi.GetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(context.Background(), integId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test IntegrationApiService ListIntegrationsApiV1AppAppIdIntegrationGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string

        resp, httpRes, err := apiClient.IntegrationApi.ListIntegrationsApiV1AppAppIdIntegrationGet(context.Background(), appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test IntegrationApiService RotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var integId string
        var appId string

        resp, httpRes, err := apiClient.IntegrationApi.RotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(context.Background(), integId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test IntegrationApiService UpdateIntegrationApiV1AppAppIdIntegrationIntegIdPut", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var integId string
        var appId string

        resp, httpRes, err := apiClient.IntegrationApi.UpdateIntegrationApiV1AppAppIdIntegrationIntegIdPut(context.Background(), integId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}
