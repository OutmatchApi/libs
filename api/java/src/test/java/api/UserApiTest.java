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
import com.outmatchapi.api.CreateUserRequest;
import com.outmatchapi.api.Error;
import com.outmatchapi.api.UpdateUserRequest;
import com.outmatchapi.api.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Disabled
public class UserApiTest {

    private final UserApi api = new UserApi();

    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        CreateUserRequest createUserRequest = null;
        User response = api.createUser(createUserRequest);
        // TODO: test validations
    }

    /**
     * Update user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        UpdateUserRequest updateUserRequest = null;
        api.updateUser(updateUserRequest);
        // TODO: test validations
    }

}
