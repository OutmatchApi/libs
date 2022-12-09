/*
api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

API version: 1.0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package video-api

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
	"os"
)


// VideosDelegatedUploadApiService VideosDelegatedUploadApi service
type VideosDelegatedUploadApiService service

type ApiDELETEUploadTokensUploadTokenRequest struct {
	ctx context.Context
	ApiService *VideosDelegatedUploadApiService
	uploadToken string
}

func (r ApiDELETEUploadTokensUploadTokenRequest) Execute() (*http.Response, error) {
	return r.ApiService.DELETEUploadTokensUploadTokenExecute(r)
}

/*
DELETEUploadTokensUploadToken Delete an upload token

Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param uploadToken The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication.
 @return ApiDELETEUploadTokensUploadTokenRequest
*/
func (a *VideosDelegatedUploadApiService) DELETEUploadTokensUploadToken(ctx context.Context, uploadToken string) ApiDELETEUploadTokensUploadTokenRequest {
	return ApiDELETEUploadTokensUploadTokenRequest{
		ApiService: a,
		ctx: ctx,
		uploadToken: uploadToken,
	}
}

// Execute executes the request
func (a *VideosDelegatedUploadApiService) DELETEUploadTokensUploadTokenExecute(r ApiDELETEUploadTokensUploadTokenRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodDelete
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "VideosDelegatedUploadApiService.DELETEUploadTokensUploadToken")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/upload-tokens/{uploadToken}"
	localVarPath = strings.Replace(localVarPath, "{"+"uploadToken"+"}", url.PathEscape(parameterToString(r.uploadToken, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v NotFound
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

type ApiGETUploadTokensRequest struct {
	ctx context.Context
	ApiService *VideosDelegatedUploadApiService
	sortBy *string
	sortOrder *string
	currentPage *int32
	pageSize *int32
}

// Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format.
func (r ApiGETUploadTokensRequest) SortBy(sortBy string) ApiGETUploadTokensRequest {
	r.sortBy = &sortBy
	return r
}

// Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A.
func (r ApiGETUploadTokensRequest) SortOrder(sortOrder string) ApiGETUploadTokensRequest {
	r.sortOrder = &sortOrder
	return r
}

// Choose the number of search results to return per page. Minimum value: 1
func (r ApiGETUploadTokensRequest) CurrentPage(currentPage int32) ApiGETUploadTokensRequest {
	r.currentPage = &currentPage
	return r
}

// Results per page. Allowed values 1-100, default is 25.
func (r ApiGETUploadTokensRequest) PageSize(pageSize int32) ApiGETUploadTokensRequest {
	r.pageSize = &pageSize
	return r
}

func (r ApiGETUploadTokensRequest) Execute() (*TokenListResponse, *http.Response, error) {
	return r.ApiService.GETUploadTokensExecute(r)
}

/*
GETUploadTokens List all active upload tokens.

A delegated token is used to allow secure uploads without exposing your API key. Use this endpoint to retrieve a list of all currently active delegated tokens.
Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiGETUploadTokensRequest
*/
func (a *VideosDelegatedUploadApiService) GETUploadTokens(ctx context.Context) ApiGETUploadTokensRequest {
	return ApiGETUploadTokensRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return TokenListResponse
func (a *VideosDelegatedUploadApiService) GETUploadTokensExecute(r ApiGETUploadTokensRequest) (*TokenListResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *TokenListResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "VideosDelegatedUploadApiService.GETUploadTokens")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/upload-tokens"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.sortBy != nil {
		localVarQueryParams.Add("sortBy", parameterToString(*r.sortBy, ""))
	}
	if r.sortOrder != nil {
		localVarQueryParams.Add("sortOrder", parameterToString(*r.sortOrder, ""))
	}
	if r.currentPage != nil {
		localVarQueryParams.Add("currentPage", parameterToString(*r.currentPage, ""))
	}
	if r.pageSize != nil {
		localVarQueryParams.Add("pageSize", parameterToString(*r.pageSize, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiGETUploadTokensUploadTokenRequest struct {
	ctx context.Context
	ApiService *VideosDelegatedUploadApiService
	uploadToken string
}

func (r ApiGETUploadTokensUploadTokenRequest) Execute() (*UploadToken, *http.Response, error) {
	return r.ApiService.GETUploadTokensUploadTokenExecute(r)
}

/*
GETUploadTokensUploadToken Show upload token

You can retrieve details about a specific upload token if you have the unique identifier for the upload token. Add it in the path of the endpoint. Details include time-to-live (ttl), when the token was created, and when it will expire.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param uploadToken The unique identifier for the token you want information about.
 @return ApiGETUploadTokensUploadTokenRequest
*/
func (a *VideosDelegatedUploadApiService) GETUploadTokensUploadToken(ctx context.Context, uploadToken string) ApiGETUploadTokensUploadTokenRequest {
	return ApiGETUploadTokensUploadTokenRequest{
		ApiService: a,
		ctx: ctx,
		uploadToken: uploadToken,
	}
}

// Execute executes the request
//  @return UploadToken
func (a *VideosDelegatedUploadApiService) GETUploadTokensUploadTokenExecute(r ApiGETUploadTokensUploadTokenRequest) (*UploadToken, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *UploadToken
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "VideosDelegatedUploadApiService.GETUploadTokensUploadToken")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/upload-tokens/{uploadToken}"
	localVarPath = strings.Replace(localVarPath, "{"+"uploadToken"+"}", url.PathEscape(parameterToString(r.uploadToken, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v NotFound
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiPOSTUploadRequest struct {
	ctx context.Context
	ApiService *VideosDelegatedUploadApiService
	token *string
	file **os.File
	contentRange *string
	videoId *string
}

// The unique identifier for the token you want to use to upload a video.
func (r ApiPOSTUploadRequest) Token(token string) ApiPOSTUploadRequest {
	r.token = &token
	return r
}

// The path to the video you want to upload.
func (r ApiPOSTUploadRequest) File(file *os.File) ApiPOSTUploadRequest {
	r.file = &file
	return r
}

// Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.
func (r ApiPOSTUploadRequest) ContentRange(contentRange string) ApiPOSTUploadRequest {
	r.contentRange = &contentRange
	return r
}

// The video id returned by the first call to this endpoint in a large video upload scenario.
func (r ApiPOSTUploadRequest) VideoId(videoId string) ApiPOSTUploadRequest {
	r.videoId = &videoId
	return r
}

func (r ApiPOSTUploadRequest) Execute() (*Video, *http.Response, error) {
	return r.ApiService.POSTUploadExecute(r)
}

/*
POSTUpload Upload with an upload token

When given a token, anyone can upload a file to the URI `https://ws.api.video/upload?token=<tokenId>`.

Example with cURL:

```curl
$ curl  --request POST --url 'https://ws.api.video/upload?token=toXXX'
 --header 'content-type: multipart/form-data'
 -F file=@video.mp4
```

Or in an HTML form, with a little JavaScript to convert the form into JSON:
```html
<!--form for user interaction-->
<form name="videoUploadForm" >
  <label for=video>Video:</label>
  <input type=file name=source/><br/>
  <input value="Submit" type="submit">
</form>
<div></div>
<!--JS takes the form data 
    uses FormData to turn the response into JSON.
    then uses POST to upload the video file.
    Update the token parameter in the url to your upload token.
    -->
<script>
   var form = document.forms.namedItem("videoUploadForm");	
   form.addEventListener('submit', function(ev) {
	 ev.preventDefault();
     var oOutput = document.querySelector("div"),
         oData = new FormData(form);
     var oReq = new XMLHttpRequest();
	 
     oReq.open("POST", "https://ws.api.video/upload?token=toXXX", true);
     oReq.send(oData);
	 oReq.onload = function(oEvent) {
       if (oReq.status ==201) {
         oOutput.innerHTML = "Your video is uploaded!<br/>"  + oReq.response;
       } else {
         oOutput.innerHTML = "Error " + oReq.status + " occurred when trying to upload your file.<br \/>";
       }
     };
   }, false);	
</script>
```


### Dealing with large files

We have created a <a href='https://api.video/blog/tutorials/uploading-large-files-with-javascript'>tutorial</a> to walk through the steps required.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiPOSTUploadRequest
*/
func (a *VideosDelegatedUploadApiService) POSTUpload(ctx context.Context) ApiPOSTUploadRequest {
	return ApiPOSTUploadRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return Video
func (a *VideosDelegatedUploadApiService) POSTUploadExecute(r ApiPOSTUploadRequest) (*Video, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *Video
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "VideosDelegatedUploadApiService.POSTUpload")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/upload"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.token == nil {
		return localVarReturnValue, nil, reportError("token is required and must be specified")
	}
	if r.file == nil {
		return localVarReturnValue, nil, reportError("file is required and must be specified")
	}

	localVarQueryParams.Add("token", parameterToString(*r.token, ""))
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"multipart/form-data"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if r.contentRange != nil {
		localVarHeaderParams["Content-Range"] = parameterToString(*r.contentRange, "")
	}
	var fileLocalVarFormFileName string
	var fileLocalVarFileName     string
	var fileLocalVarFileBytes    []byte

	fileLocalVarFormFileName = "file"

	fileLocalVarFile := *r.file
	if fileLocalVarFile != nil {
		fbs, _ := ioutil.ReadAll(fileLocalVarFile)
		fileLocalVarFileBytes = fbs
		fileLocalVarFileName = fileLocalVarFile.Name()
		fileLocalVarFile.Close()
	}
	formFiles = append(formFiles, formFile{fileBytes: fileLocalVarFileBytes, fileName: fileLocalVarFileName, formFileName: fileLocalVarFormFileName})
	if r.videoId != nil {
		localVarFormParams.Add("videoId", parameterToString(*r.videoId, ""))
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v BadRequest
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiPOSTUploadTokensRequest struct {
	ctx context.Context
	ApiService *VideosDelegatedUploadApiService
	tokenCreatePayload *TokenCreatePayload
}

func (r ApiPOSTUploadTokensRequest) TokenCreatePayload(tokenCreatePayload TokenCreatePayload) ApiPOSTUploadTokensRequest {
	r.tokenCreatePayload = &tokenCreatePayload
	return r
}

func (r ApiPOSTUploadTokensRequest) Execute() (*UploadToken, *http.Response, error) {
	return r.ApiService.POSTUploadTokensExecute(r)
}

/*
POSTUploadTokens Generate an upload token

Use this endpoint to generate an upload token. You can use this token to authenticate video uploads while keeping your API key safe. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiPOSTUploadTokensRequest
*/
func (a *VideosDelegatedUploadApiService) POSTUploadTokens(ctx context.Context) ApiPOSTUploadTokensRequest {
	return ApiPOSTUploadTokensRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return UploadToken
func (a *VideosDelegatedUploadApiService) POSTUploadTokensExecute(r ApiPOSTUploadTokensRequest) (*UploadToken, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *UploadToken
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "VideosDelegatedUploadApiService.POSTUploadTokens")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/upload-tokens"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.tokenCreatePayload
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v BadRequest
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
