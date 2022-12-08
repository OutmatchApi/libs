<?php
/**
 * AdminAppsApprovedApi
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
 * AdminAppsApprovedApi Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class AdminAppsApprovedApi
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
        'adminAppsApprovedList' => [
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
     * Operation adminAppsApprovedList
     *
     * @param  string $token Authentication token. Requires scope: &#x60;admin.apps:read&#x60; (required)
     * @param  int $limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param  string $cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param  string $team_id team_id (optional)
     * @param  string $enterprise_id enterprise_id (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['adminAppsApprovedList'] to see the possible values for this operation
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DefaultSuccessTemplate|\OpenAPI\Client\Model\DefaultErrorTemplate
     */
    public function adminAppsApprovedList($token, $limit = null, $cursor = null, $team_id = null, $enterprise_id = null, string $contentType = self::contentTypes['adminAppsApprovedList'][0])
    {
        list($response) = $this->adminAppsApprovedListWithHttpInfo($token, $limit, $cursor, $team_id, $enterprise_id, $contentType);
        return $response;
    }

    /**
     * Operation adminAppsApprovedListWithHttpInfo
     *
     * @param  string $token Authentication token. Requires scope: &#x60;admin.apps:read&#x60; (required)
     * @param  int $limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param  string $cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param  string $team_id (optional)
     * @param  string $enterprise_id (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['adminAppsApprovedList'] to see the possible values for this operation
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DefaultSuccessTemplate|\OpenAPI\Client\Model\DefaultErrorTemplate, HTTP status code, HTTP response headers (array of strings)
     */
    public function adminAppsApprovedListWithHttpInfo($token, $limit = null, $cursor = null, $team_id = null, $enterprise_id = null, string $contentType = self::contentTypes['adminAppsApprovedList'][0])
    {
        $request = $this->adminAppsApprovedListRequest($token, $limit, $cursor, $team_id, $enterprise_id, $contentType);

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
     * Operation adminAppsApprovedListAsync
     *
     * @param  string $token Authentication token. Requires scope: &#x60;admin.apps:read&#x60; (required)
     * @param  int $limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param  string $cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param  string $team_id (optional)
     * @param  string $enterprise_id (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['adminAppsApprovedList'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function adminAppsApprovedListAsync($token, $limit = null, $cursor = null, $team_id = null, $enterprise_id = null, string $contentType = self::contentTypes['adminAppsApprovedList'][0])
    {
        return $this->adminAppsApprovedListAsyncWithHttpInfo($token, $limit, $cursor, $team_id, $enterprise_id, $contentType)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation adminAppsApprovedListAsyncWithHttpInfo
     *
     * @param  string $token Authentication token. Requires scope: &#x60;admin.apps:read&#x60; (required)
     * @param  int $limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param  string $cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param  string $team_id (optional)
     * @param  string $enterprise_id (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['adminAppsApprovedList'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function adminAppsApprovedListAsyncWithHttpInfo($token, $limit = null, $cursor = null, $team_id = null, $enterprise_id = null, string $contentType = self::contentTypes['adminAppsApprovedList'][0])
    {
        $returnType = '\OpenAPI\Client\Model\DefaultSuccessTemplate';
        $request = $this->adminAppsApprovedListRequest($token, $limit, $cursor, $team_id, $enterprise_id, $contentType);

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
     * Create request for operation 'adminAppsApprovedList'
     *
     * @param  string $token Authentication token. Requires scope: &#x60;admin.apps:read&#x60; (required)
     * @param  int $limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param  string $cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param  string $team_id (optional)
     * @param  string $enterprise_id (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['adminAppsApprovedList'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    public function adminAppsApprovedListRequest($token, $limit = null, $cursor = null, $team_id = null, $enterprise_id = null, string $contentType = self::contentTypes['adminAppsApprovedList'][0])
    {

        // verify the required parameter 'token' is set
        if ($token === null || (is_array($token) && count($token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $token when calling adminAppsApprovedList'
            );
        }






        $resourcePath = '/admin.apps.approved.list';
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
            $limit,
            'limit', // param base name
            'integer', // openApiType
            'form', // style
            true, // explode
            false // required
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
            $team_id,
            'team_id', // param base name
            'string', // openApiType
            'form', // style
            true, // explode
            false // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $enterprise_id,
            'enterprise_id', // param base name
            'string', // openApiType
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