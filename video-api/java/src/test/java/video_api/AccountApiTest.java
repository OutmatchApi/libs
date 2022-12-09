/*
 * api.video
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package video_api;

import invalidPackageName.ApiException;
import com.outmatchapi.video_api.Account;
import com.outmatchapi.video_api.NotFound;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Disabled
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    /**
     * Show account
     *
     * Deprecated. Authenticate and get a token, then you can use the bearer token here to retrieve details about your account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gETAccountTest() throws ApiException {
        Account response = api.gETAccount();
        // TODO: test validations
    }

}
