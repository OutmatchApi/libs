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
import com.outmatchapi.video_api.BadRequest;
import java.io.File;
import com.outmatchapi.video_api.NotFound;
import com.outmatchapi.video_api.Player;
import com.outmatchapi.video_api.PlayerCreationPayload;
import com.outmatchapi.video_api.PlayerUpdatePayload;
import com.outmatchapi.video_api.PlayersListResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlayersApi
 */
@Disabled
public class PlayersApiTest {

    private final PlayersApi api = new PlayersApi();

    /**
     * Delete a player
     *
     * Delete a player if you no longer need it. You can delete any player that you have the player ID for.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dELETEPlayersPlayerIdTest() throws ApiException {
        String playerId = null;
        api.dELETEPlayersPlayerId(playerId);
        // TODO: test validations
    }

    /**
     * Delete logo
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dELETEPlayersPlayerIdLogoTest() throws ApiException {
        String playerId = null;
        Object response = api.dELETEPlayersPlayerIdLogo(playerId);
        // TODO: test validations
    }

    /**
     * List all players
     *
     * Retrieve a list of all the players you created, as well as details about each one. Tutorials that use the [player endpoint](https://api.video/blog/endpoints/player).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gETPlayersTest() throws ApiException {
        String sortBy = null;
        String sortOrder = null;
        Integer currentPage = null;
        Integer pageSize = null;
        PlayersListResponse response = api.gETPlayers()
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .currentPage(currentPage)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Show a player
     *
     * Use a player ID to retrieve details about the player and display it for viewers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gETPlayersPlayerIdTest() throws ApiException {
        String playerId = null;
        Player response = api.gETPlayersPlayerId(playerId);
        // TODO: test validations
    }

    /**
     * Update a player
     *
     * Use a player ID to update specific details for a player. NOTE: It may take up to 10 min before the new player configuration is available from our CDN.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pATCHPlayersPlayerIdTest() throws ApiException {
        String playerId = null;
        PlayerUpdatePayload playerUpdatePayload = null;
        Player response = api.pATCHPlayersPlayerId(playerId, playerUpdatePayload);
        // TODO: test validations
    }

    /**
     * Create a player
     *
     * Create a player for your video, and customise it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pOSTPlayersTest() throws ApiException {
        PlayerCreationPayload playerCreationPayload = null;
        Player response = api.pOSTPlayers(playerCreationPayload);
        // TODO: test validations
    }

    /**
     * Upload a logo
     *
     * The uploaded image maximum size should be 200x100 and its weight should be 200KB.  It will be scaled down to 30px height and converted to PNG to be displayed in the player.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pOSTPlayersPlayerIdLogoTest() throws ApiException {
        String playerId = null;
        File _file = null;
        String link = null;
        Player response = api.pOSTPlayersPlayerIdLogo(playerId, _file, link);
        // TODO: test validations
    }

}
