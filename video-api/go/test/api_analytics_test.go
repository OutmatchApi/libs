/*
api.video

Testing AnalyticsApiService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package video-api

import (
    "context"
    "github.com/stretchr/testify/assert"
    "github.com/stretchr/testify/require"
    "testing"
    openapiclient "./openapi"
)

func Test_video-api_AnalyticsApiService(t *testing.T) {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)

    t.Run("Test AnalyticsApiService GETAnalyticsLiveStreamsLiveStreamId", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var liveStreamId string

        resp, httpRes, err := apiClient.AnalyticsApi.GETAnalyticsLiveStreamsLiveStreamId(context.Background(), liveStreamId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test AnalyticsApiService GETAnalyticsSessionsSessionIdEvents", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var sessionId string

        resp, httpRes, err := apiClient.AnalyticsApi.GETAnalyticsSessionsSessionIdEvents(context.Background(), sessionId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test AnalyticsApiService GETAnalyticsVideosVideoId", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var videoId string

        resp, httpRes, err := apiClient.AnalyticsApi.GETAnalyticsVideosVideoId(context.Background(), videoId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}