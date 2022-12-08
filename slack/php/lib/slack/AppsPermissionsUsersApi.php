<?php
/**
 * AppsPermissionsUsersApi
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 6.2.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\slack;

use GuzzleHttp\Client;
use GuzzleHttp\ClientInterface;
use GuzzleHttp\Exception\ConnectException;
use GuzzleHttp\Exception\RequestException;
use GuzzleHttp\Psr7\MultipartStream;
use GuzzleHttp\Psr7\Request;
use GuzzleHttp\RequestOptions;
use OpenAPI\Client\ApiException;
use OpenAPI\Client\Configuration;
use OpenAPI\Client\HeaderSelector;
use OpenAPI\Client\ObjectSerializer;

/**
 * AppsPermissionsUsersApi Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class AppsPermissionsUsersApi
{
    /**
     * @var ClientInterface
     */
    protected $client;

    /**
     * @var Configuration
     */
    protected $config;

    /**
     * @var HeaderSelector
     */
    protected $headerSelector;

    /**
     * @var int Host index
     */
    protected $hostIndex;

    /** @var string[] $contentTypes **/
    public const contentTypes = [
        'appsPermissionsUsersList' => [
            'application/json',
        ],
        'appsPermissionsUsersRequest' => [
            'application/json',
        ],
    ];

/**
     * @param ClientInterface $client
     * @param Configuration   $config
     * @param HeaderSelector  $selector
     * @param int             $hostIndex (Optional) host index to select the list of hosts if defined in the OpenAPI spec
     */
    public function __construct(
        ClientInterface $client = null,
        Configuration $config = null,
        HeaderSelector $selector = null,
        $hostIndex = 0
    ) {
        $this->client = $client ?: new Client();
        $this->config = $config ?: new Configuration();
        $this->headerSelector = $selector ?: new HeaderSelector();
        $this->hostIndex = $hostIndex;
    }

    /**
     * Set the host index
     *
     * @param int $hostIndex Host index (required)
     */
    public function setHostIndex($hostIndex): void
    {
        $this->hostIndex = $hostIndex;
    }

    /**
     * Get the host index
     *
     * @return int Host index
     */
    public function getHostIndex()
    {
        return $this->hostIndex;
    }

    /**
     * @return Configuration
     */
    public function getConfig()
    {
        return $this->config;
    }

    /**
     * Operation appsPermissionsUsersList
     *
     * @param  string $token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param  string $cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. (optional)
     * @param  int $limit The maximum number of items to return. (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['appsPermissionsUsersList'] to see the possible values for this operation
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DefaultSuccessTemplate|\OpenAPI\Client\Model\DefaultErrorTemplate
     */
    public function appsPermissionsUsersList($token, $cursor = null, $limit = null, string $contentType = self::contentTypes['appsPermissionsUsersList'][0])
    {
        list($response) = $this->appsPermissionsUsersListWithHttpInfo($token, $cursor, $limit, $contentType);
        return $response;
    }

    /**
     * Operation appsPermissionsUsersListWithHttpInfo
     *
     * @param  string $token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param  string $cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. (optional)
     * @param  int $limit The maximum number of items to return. (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['appsPermissionsUsersList'] to see the possible values for this operation
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DefaultSuccessTemplate|\OpenAPI\Client\Model\DefaultErrorTemplate, HTTP status code, HTTP response headers (array of strings)
     */
    public function appsPermissionsUsersListWithHttpInfo($token, $cursor = null, $limit = null, string $contentType = self::contentTypes['appsPermissionsUsersList'][0])
    {
        $request = $this->appsPermissionsUsersListRequest($token, $cursor, $limit, $contentType);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? (string) $e->getResponse()->getBody() : null
                );
            } catch (ConnectException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    null,
                    null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        (string) $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    (string) $response->getBody()
                );
            }

            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DefaultSuccessTemplate' === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ('\OpenAPI\Client\Model\DefaultSuccessTemplate' !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DefaultSuccessTemplate', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('\OpenAPI\Client\Model\DefaultErrorTemplate' === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ('\OpenAPI\Client\Model\DefaultErrorTemplate' !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DefaultErrorTemplate', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\DefaultSuccessTemplate';
            if ($returnType === '\SplFileObject') {
                $content = $response->getBody(); //stream goes to serializer
            } else {
                $content = (string) $response->getBody();
                if ($returnType !== 'string') {
                    $content = json_decode($content);
                }
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\OpenAPI\Client\Model\DefaultSuccessTemplate',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\OpenAPI\Client\Model\DefaultErrorTemplate',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation appsPermissionsUsersListAsync
     *
     * @param  string $token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param  string $cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. (optional)
     * @param  int $limit The maximum number of items to return. (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['appsPermissionsUsersList'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function appsPermissionsUsersListAsync($token, $cursor = null, $limit = null, string $contentType = self::contentTypes['appsPermissionsUsersList'][0])
    {
        return $this->appsPermissionsUsersListAsyncWithHttpInfo($token, $cursor, $limit, $contentType)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation appsPermissionsUsersListAsyncWithHttpInfo
     *
     * @param  string $token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param  string $cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. (optional)
     * @param  int $limit The maximum number of items to return. (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['appsPermissionsUsersList'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function appsPermissionsUsersListAsyncWithHttpInfo($token, $cursor = null, $limit = null, string $contentType = self::contentTypes['appsPermissionsUsersList'][0])
    {
        $returnType = '\OpenAPI\Client\Model\DefaultSuccessTemplate';
        $request = $this->appsPermissionsUsersListRequest($token, $cursor, $limit, $contentType);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    if ($returnType === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ($returnType !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, $returnType, []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        (string) $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'appsPermissionsUsersList'
     *
     * @param  string $token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param  string $cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. (optional)
     * @param  int $limit The maximum number of items to return. (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['appsPermissionsUsersList'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    public function appsPermissionsUsersListRequest($token, $cursor = null, $limit = null, string $contentType = self::contentTypes['appsPermissionsUsersList'][0])
    {

        // verify the required parameter 'token' is set
        if ($token === null || (is_array($token) && count($token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $token when calling appsPermissionsUsersList'
            );
        }




        $resourcePath = '/apps.permissions.users.list';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $token,
            'token', // param base name
            'string', // openApiType
            'form', // style
            true, // explode
            true // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $cursor,
            'cursor', // param base name
            'string', // openApiType
            'form', // style
            true, // explode
            false // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $limit,
            'limit', // param base name
            'integer', // openApiType
            'form', // style
            true, // explode
            false // required
        ) ?? []);




        $headers = $this->headerSelector->selectHeaders(
            ['application/json', ],
            $contentType,
            $multipart
        );

        // for model (json/xml)
        if (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $formParamValueItems = is_array($formParamValue) ? $formParamValue : [$formParamValue];
                    foreach ($formParamValueItems as $formParamValueItem) {
                        $multipartContents[] = [
                            'name' => $formParamName,
                            'contents' => $formParamValueItem
                        ];
                    }
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif (stripos($headers['Content-Type'], 'application/json') !== false) {
                # if Content-Type contains "application/json", json_encode the form parameters
                $httpBody = \GuzzleHttp\json_encode($formParams);
            } else {
                // for HTTP post (form)
                $httpBody = ObjectSerializer::buildQuery($formParams);
            }
        }

        // this endpoint requires OAuth (access token)
        if (!empty($this->config->getAccessToken())) {
            $headers['Authorization'] = 'Bearer ' . $this->config->getAccessToken();
        }

        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $operationHost = $this->config->getHost();
        $query = ObjectSerializer::buildQuery($queryParams);
        return new Request(
            'GET',
            $operationHost . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation appsPermissionsUsersRequest
     *
     * @param  string $token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param  string $scopes A comma separated list of user scopes to request for (required)
     * @param  string $trigger_id Token used to trigger the request (required)
     * @param  string $user The user this scope is being requested for (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['appsPermissionsUsersRequest'] to see the possible values for this operation
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DefaultSuccessTemplate|\OpenAPI\Client\Model\DefaultErrorTemplate
     */
    public function appsPermissionsUsersRequest($token, $scopes, $trigger_id, $user, string $contentType = self::contentTypes['appsPermissionsUsersRequest'][0])
    {
        list($response) = $this->appsPermissionsUsersRequestWithHttpInfo($token, $scopes, $trigger_id, $user, $contentType);
        return $response;
    }

    /**
     * Operation appsPermissionsUsersRequestWithHttpInfo
     *
     * @param  string $token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param  string $scopes A comma separated list of user scopes to request for (required)
     * @param  string $trigger_id Token used to trigger the request (required)
     * @param  string $user The user this scope is being requested for (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['appsPermissionsUsersRequest'] to see the possible values for this operation
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DefaultSuccessTemplate|\OpenAPI\Client\Model\DefaultErrorTemplate, HTTP status code, HTTP response headers (array of strings)
     */
    public function appsPermissionsUsersRequestWithHttpInfo($token, $scopes, $trigger_id, $user, string $contentType = self::contentTypes['appsPermissionsUsersRequest'][0])
    {
        $request = $this->appsPermissionsUsersRequestRequest($token, $scopes, $trigger_id, $user, $contentType);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? (string) $e->getResponse()->getBody() : null
                );
            } catch (ConnectException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    null,
                    null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        (string) $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    (string) $response->getBody()
                );
            }

            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DefaultSuccessTemplate' === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ('\OpenAPI\Client\Model\DefaultSuccessTemplate' !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DefaultSuccessTemplate', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('\OpenAPI\Client\Model\DefaultErrorTemplate' === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ('\OpenAPI\Client\Model\DefaultErrorTemplate' !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DefaultErrorTemplate', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\DefaultSuccessTemplate';
            if ($returnType === '\SplFileObject') {
                $content = $response->getBody(); //stream goes to serializer
            } else {
                $content = (string) $response->getBody();
                if ($returnType !== 'string') {
                    $content = json_decode($content);
                }
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\OpenAPI\Client\Model\DefaultSuccessTemplate',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\OpenAPI\Client\Model\DefaultErrorTemplate',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation appsPermissionsUsersRequestAsync
     *
     * @param  string $token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param  string $scopes A comma separated list of user scopes to request for (required)
     * @param  string $trigger_id Token used to trigger the request (required)
     * @param  string $user The user this scope is being requested for (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['appsPermissionsUsersRequest'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function appsPermissionsUsersRequestAsync($token, $scopes, $trigger_id, $user, string $contentType = self::contentTypes['appsPermissionsUsersRequest'][0])
    {
        return $this->appsPermissionsUsersRequestAsyncWithHttpInfo($token, $scopes, $trigger_id, $user, $contentType)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation appsPermissionsUsersRequestAsyncWithHttpInfo
     *
     * @param  string $token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param  string $scopes A comma separated list of user scopes to request for (required)
     * @param  string $trigger_id Token used to trigger the request (required)
     * @param  string $user The user this scope is being requested for (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['appsPermissionsUsersRequest'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function appsPermissionsUsersRequestAsyncWithHttpInfo($token, $scopes, $trigger_id, $user, string $contentType = self::contentTypes['appsPermissionsUsersRequest'][0])
    {
        $returnType = '\OpenAPI\Client\Model\DefaultSuccessTemplate';
        $request = $this->appsPermissionsUsersRequestRequest($token, $scopes, $trigger_id, $user, $contentType);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    if ($returnType === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ($returnType !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, $returnType, []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        (string) $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'appsPermissionsUsersRequest'
     *
     * @param  string $token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param  string $scopes A comma separated list of user scopes to request for (required)
     * @param  string $trigger_id Token used to trigger the request (required)
     * @param  string $user The user this scope is being requested for (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['appsPermissionsUsersRequest'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    public function appsPermissionsUsersRequestRequest($token, $scopes, $trigger_id, $user, string $contentType = self::contentTypes['appsPermissionsUsersRequest'][0])
    {

        // verify the required parameter 'token' is set
        if ($token === null || (is_array($token) && count($token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $token when calling appsPermissionsUsersRequest'
            );
        }

        // verify the required parameter 'scopes' is set
        if ($scopes === null || (is_array($scopes) && count($scopes) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $scopes when calling appsPermissionsUsersRequest'
            );
        }

        // verify the required parameter 'trigger_id' is set
        if ($trigger_id === null || (is_array($trigger_id) && count($trigger_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $trigger_id when calling appsPermissionsUsersRequest'
            );
        }

        // verify the required parameter 'user' is set
        if ($user === null || (is_array($user) && count($user) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $user when calling appsPermissionsUsersRequest'
            );
        }


        $resourcePath = '/apps.permissions.users.request';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $token,
            'token', // param base name
            'string', // openApiType
            'form', // style
            true, // explode
            true // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $scopes,
            'scopes', // param base name
            'string', // openApiType
            'form', // style
            true, // explode
            true // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $trigger_id,
            'trigger_id', // param base name
            'string', // openApiType
            'form', // style
            true, // explode
            true // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $user,
            'user', // param base name
            'string', // openApiType
            'form', // style
            true, // explode
            true // required
        ) ?? []);




        $headers = $this->headerSelector->selectHeaders(
            ['application/json', ],
            $contentType,
            $multipart
        );

        // for model (json/xml)
        if (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $formParamValueItems = is_array($formParamValue) ? $formParamValue : [$formParamValue];
                    foreach ($formParamValueItems as $formParamValueItem) {
                        $multipartContents[] = [
                            'name' => $formParamName,
                            'contents' => $formParamValueItem
                        ];
                    }
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif (stripos($headers['Content-Type'], 'application/json') !== false) {
                # if Content-Type contains "application/json", json_encode the form parameters
                $httpBody = \GuzzleHttp\json_encode($formParams);
            } else {
                // for HTTP post (form)
                $httpBody = ObjectSerializer::buildQuery($formParams);
            }
        }

        // this endpoint requires OAuth (access token)
        if (!empty($this->config->getAccessToken())) {
            $headers['Authorization'] = 'Bearer ' . $this->config->getAccessToken();
        }

        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $operationHost = $this->config->getHost();
        $query = ObjectSerializer::buildQuery($queryParams);
        return new Request(
            'GET',
            $operationHost . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Create http client option
     *
     * @throws \RuntimeException on file opening failure
     * @return array of http client options
     */
    protected function createHttpClientOption()
    {
        $options = [];
        if ($this->config->getDebug()) {
            $options[RequestOptions::DEBUG] = fopen($this->config->getDebugFile(), 'a');
            if (!$options[RequestOptions::DEBUG]) {
                throw new \RuntimeException('Failed to open the debug file: ' . $this->config->getDebugFile());
            }
        }

        return $options;
    }
}