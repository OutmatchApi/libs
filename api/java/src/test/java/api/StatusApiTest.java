/*
 * Outmatch API
 * Outmatch API
 *
 * The version of the OpenAPI document: 0.0.44
 * Contact: internal@outmatchapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package api;

import invalidPackageName.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatusApi
 */
@Disabled
public class StatusApiTest {

    private final StatusApi api = new StatusApi();

    /**
     * Check the API status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        api.getStatus();
        // TODO: test validations
    }

}