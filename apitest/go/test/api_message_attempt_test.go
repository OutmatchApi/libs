/*
Svix API

Testing MessageAttemptApiService

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

func Test_apitest_MessageAttemptApiService(t *testing.T) {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)

    t.Run("Test MessageAttemptApiService GetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var attemptId string
        var msgId string
        var appId string

        resp, httpRes, err := apiClient.MessageAttemptApi.GetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(context.Background(), attemptId, msgId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test MessageAttemptApiService ListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var msgId string
        var appId string

        resp, httpRes, err := apiClient.MessageAttemptApi.ListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(context.Background(), msgId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test MessageAttemptApiService ListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var endpointId string
        var appId string

        resp, httpRes, err := apiClient.MessageAttemptApi.ListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(context.Background(), endpointId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test MessageAttemptApiService ListAttemptsApiV1AppAppIdMsgMsgIdAttemptGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string
        var msgId string

        resp, httpRes, err := apiClient.MessageAttemptApi.ListAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(context.Background(), appId, msgId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test MessageAttemptApiService ListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string
        var endpointId string

        resp, httpRes, err := apiClient.MessageAttemptApi.ListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(context.Background(), appId, endpointId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test MessageAttemptApiService ListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var appId string
        var msgId string

        resp, httpRes, err := apiClient.MessageAttemptApi.ListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(context.Background(), appId, msgId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test MessageAttemptApiService ListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var msgId string
        var appId string
        var endpointId string

        resp, httpRes, err := apiClient.MessageAttemptApi.ListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(context.Background(), msgId, appId, endpointId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test MessageAttemptApiService ResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var endpointId string
        var msgId string
        var appId string

        resp, httpRes, err := apiClient.MessageAttemptApi.ResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(context.Background(), endpointId, msgId, appId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}