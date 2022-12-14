/*
Svix API

Testing EventTypeApiService

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

func Test_apitest_EventTypeApiService(t *testing.T) {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)

    t.Run("Test EventTypeApiService CreateEventTypeApiV1EventTypePost", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.EventTypeApi.CreateEventTypeApiV1EventTypePost(context.Background()).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EventTypeApiService DeleteEventTypeApiV1EventTypeEventTypeNameDelete", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var eventTypeName string

        resp, httpRes, err := apiClient.EventTypeApi.DeleteEventTypeApiV1EventTypeEventTypeNameDelete(context.Background(), eventTypeName).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EventTypeApiService GetEventTypeApiV1EventTypeEventTypeNameGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var eventTypeName string

        resp, httpRes, err := apiClient.EventTypeApi.GetEventTypeApiV1EventTypeEventTypeNameGet(context.Background(), eventTypeName).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EventTypeApiService ListEventTypesApiV1EventTypeGet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.EventTypeApi.ListEventTypesApiV1EventTypeGet(context.Background()).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test EventTypeApiService UpdateEventTypeApiV1EventTypeEventTypeNamePut", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var eventTypeName string

        resp, httpRes, err := apiClient.EventTypeApi.UpdateEventTypeApiV1EventTypeEventTypeNamePut(context.Background(), eventTypeName).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}
