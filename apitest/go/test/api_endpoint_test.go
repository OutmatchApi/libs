/*
Svix API

Testing EndpointApiService

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

func Test_apitest_EndpointApiService(t *testing.T) {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)

    t.Run("Test EndpointApiService CreateEndpointApiV1AppAppIdEndpointPost", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string

        resp, httpRes, err := apiClient.EndpointApi.CreateEndpointApiV1AppAppIdEndpointPost(context.Background(), appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService DeleteEndpointApiV1AppAppIdEndpointEndpointIdDelete", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var endpointId string
        var appId string

        resp, httpRes, err := apiClient.EndpointApi.DeleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(context.Background(), endpointId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService GetEndpointApiV1AppAppIdEndpointEndpointIdGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var endpointId string
        var appId string

        resp, httpRes, err := apiClient.EndpointApi.GetEndpointApiV1AppAppIdEndpointEndpointIdGet(context.Background(), endpointId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService GetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var endpointId string
        var appId string

        resp, httpRes, err := apiClient.EndpointApi.GetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(context.Background(), endpointId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService GetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var endpointId string
        var appId string

        resp, httpRes, err := apiClient.EndpointApi.GetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(context.Background(), endpointId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService GetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var endpointId string
        var appId string

        resp, httpRes, err := apiClient.EndpointApi.GetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(context.Background(), endpointId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService ListEndpointsApiV1AppAppIdEndpointGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string

        resp, httpRes, err := apiClient.EndpointApi.ListEndpointsApiV1AppAppIdEndpointGet(context.Background(), appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService PatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string
        var endpointId string

        resp, httpRes, err := apiClient.EndpointApi.PatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(context.Background(), appId, endpointId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService RecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string
        var endpointId string

        resp, httpRes, err := apiClient.EndpointApi.RecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(context.Background(), appId, endpointId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService ReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string
        var endpointId string

        resp, httpRes, err := apiClient.EndpointApi.ReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(context.Background(), appId, endpointId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService RotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var endpointId string
        var appId string

        resp, httpRes, err := apiClient.EndpointApi.RotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(context.Background(), endpointId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService UpdateEndpointApiV1AppAppIdEndpointEndpointIdPut", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var endpointId string
        var appId string

        resp, httpRes, err := apiClient.EndpointApi.UpdateEndpointApiV1AppAppIdEndpointEndpointIdPut(context.Background(), endpointId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EndpointApiService UpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string
        var endpointId string

        resp, httpRes, err := apiClient.EndpointApi.UpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(context.Background(), appId, endpointId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}