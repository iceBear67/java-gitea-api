/**
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.16.8+97-gee14285
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.gitea.api;

import com.gitea.ApiException;
import com.gitea.model.Repository;
import com.gitea.model.CreateRepoOption;
import com.gitea.model.UserSettings;
import com.gitea.model.UserSettingsOptions;
import com.gitea.model.Email;
import com.gitea.model.CreateEmailOption;
import com.gitea.model.OAuth2Application;
import com.gitea.model.CreateOAuth2ApplicationOptions;
import com.gitea.model.AccessToken;
import com.gitea.model.CreateAccessTokenOption;
import com.gitea.model.GPGKey;
import com.gitea.model.PublicKey;
import com.gitea.model.User;
import com.gitea.model.CreateGPGKeyOption;
import com.gitea.model.CreateKeyOption;
import com.gitea.model.TrackedTime;
import org.joda.time.DateTime;
import com.gitea.model.DeleteEmailOption;
import com.gitea.model.UserHeatmapData;
import com.gitea.model.StopWatch;
import com.gitea.model.Team;
import com.gitea.model.InlineResponse2001;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Create a repository
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCurrentUserRepoTest() throws ApiException {
        CreateRepoOption body = null;
        // Repository response = api.createCurrentUserRepo(body);

        // TODO: test validations
    }
    
    /**
     * Get user settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserSettingsTest() throws ApiException {
        // List<UserSettings> response = api.getUserSettings();

        // TODO: test validations
    }
    
    /**
     * Get a Token to verify
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVerificationTokenTest() throws ApiException {
        // String response = api.getVerificationToken();

        // TODO: test validations
    }
    
    /**
     * Update user settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserSettingsTest() throws ApiException {
        UserSettingsOptions body = null;
        // List<UserSettings> response = api.updateUserSettings(body);

        // TODO: test validations
    }
    
    /**
     * Add email addresses
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userAddEmailTest() throws ApiException {
        CreateEmailOption body = null;
        // List<Email> response = api.userAddEmail(body);

        // TODO: test validations
    }
    
    /**
     * Check if one user is following another user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCheckFollowingTest() throws ApiException {
        String follower = null;
        String followee = null;
        // api.userCheckFollowing(follower, followee);

        // TODO: test validations
    }
    
    /**
     * creates a new OAuth2 application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCreateOAuth2ApplicationTest() throws ApiException {
        CreateOAuth2ApplicationOptions body = null;
        // OAuth2Application response = api.userCreateOAuth2Application(body);

        // TODO: test validations
    }
    
    /**
     * Create an access token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCreateTokenTest() throws ApiException {
        String username = null;
        CreateAccessTokenOption userCreateToken = null;
        // AccessToken response = api.userCreateToken(username, userCreateToken);

        // TODO: test validations
    }
    
    /**
     * Check whether a user is followed by the authenticated user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentCheckFollowingTest() throws ApiException {
        String username = null;
        // api.userCurrentCheckFollowing(username);

        // TODO: test validations
    }
    
    /**
     * Whether the authenticated is starring the repo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentCheckStarringTest() throws ApiException {
        String owner = null;
        String repo = null;
        // api.userCurrentCheckStarring(owner, repo);

        // TODO: test validations
    }
    
    /**
     * Unfollow a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentDeleteFollowTest() throws ApiException {
        String username = null;
        // api.userCurrentDeleteFollow(username);

        // TODO: test validations
    }
    
    /**
     * Remove a GPG key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentDeleteGPGKeyTest() throws ApiException {
        Long id = null;
        // api.userCurrentDeleteGPGKey(id);

        // TODO: test validations
    }
    
    /**
     * Delete a public key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentDeleteKeyTest() throws ApiException {
        Long id = null;
        // api.userCurrentDeleteKey(id);

        // TODO: test validations
    }
    
    /**
     * Unstar the given repo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentDeleteStarTest() throws ApiException {
        String owner = null;
        String repo = null;
        // api.userCurrentDeleteStar(owner, repo);

        // TODO: test validations
    }
    
    /**
     * Get a GPG key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentGetGPGKeyTest() throws ApiException {
        Long id = null;
        // GPGKey response = api.userCurrentGetGPGKey(id);

        // TODO: test validations
    }
    
    /**
     * Get a public key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentGetKeyTest() throws ApiException {
        Long id = null;
        // PublicKey response = api.userCurrentGetKey(id);

        // TODO: test validations
    }
    
    /**
     * List the authenticated user&#39;s followers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListFollowersTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        // List<User> response = api.userCurrentListFollowers(page, limit);

        // TODO: test validations
    }
    
    /**
     * List the users that the authenticated user is following
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListFollowingTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        // List<User> response = api.userCurrentListFollowing(page, limit);

        // TODO: test validations
    }
    
    /**
     * List the authenticated user&#39;s GPG keys
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListGPGKeysTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        // List<GPGKey> response = api.userCurrentListGPGKeys(page, limit);

        // TODO: test validations
    }
    
    /**
     * List the authenticated user&#39;s public keys
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListKeysTest() throws ApiException {
        String fingerprint = null;
        Integer page = null;
        Integer limit = null;
        // List<PublicKey> response = api.userCurrentListKeys(fingerprint, page, limit);

        // TODO: test validations
    }
    
    /**
     * List the repos that the authenticated user owns
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListReposTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        // List<Repository> response = api.userCurrentListRepos(page, limit);

        // TODO: test validations
    }
    
    /**
     * The repos that the authenticated user has starred
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListStarredTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        // List<Repository> response = api.userCurrentListStarred(page, limit);

        // TODO: test validations
    }
    
    /**
     * List repositories watched by the authenticated user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListSubscriptionsTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        // List<Repository> response = api.userCurrentListSubscriptions(page, limit);

        // TODO: test validations
    }
    
    /**
     * Create a GPG key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentPostGPGKeyTest() throws ApiException {
        CreateGPGKeyOption form = null;
        // GPGKey response = api.userCurrentPostGPGKey(form);

        // TODO: test validations
    }
    
    /**
     * Create a public key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentPostKeyTest() throws ApiException {
        CreateKeyOption body = null;
        // PublicKey response = api.userCurrentPostKey(body);

        // TODO: test validations
    }
    
    /**
     * Follow a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentPutFollowTest() throws ApiException {
        String username = null;
        // api.userCurrentPutFollow(username);

        // TODO: test validations
    }
    
    /**
     * Star the given repo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentPutStarTest() throws ApiException {
        String owner = null;
        String repo = null;
        // api.userCurrentPutStar(owner, repo);

        // TODO: test validations
    }
    
    /**
     * List the current user&#39;s tracked times
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentTrackedTimesTest() throws ApiException {
        DateTime since = null;
        DateTime before = null;
        // List<TrackedTime> response = api.userCurrentTrackedTimes(since, before);

        // TODO: test validations
    }
    
    /**
     * delete an access token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userDeleteAccessTokenTest() throws ApiException {
        String username = null;
        String token = null;
        // api.userDeleteAccessToken(username, token);

        // TODO: test validations
    }
    
    /**
     * Delete email addresses
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userDeleteEmailTest() throws ApiException {
        DeleteEmailOption body = null;
        // api.userDeleteEmail(body);

        // TODO: test validations
    }
    
    /**
     * delete an OAuth2 Application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userDeleteOAuth2ApplicationTest() throws ApiException {
        Long id = null;
        // api.userDeleteOAuth2Application(id);

        // TODO: test validations
    }
    
    /**
     * Get a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetTest() throws ApiException {
        String username = null;
        // User response = api.userGet(username);

        // TODO: test validations
    }
    
    /**
     * Get the authenticated user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetCurrentTest() throws ApiException {
        // User response = api.userGetCurrent();

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s heatmap
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetHeatmapDataTest() throws ApiException {
        String username = null;
        // List<UserHeatmapData> response = api.userGetHeatmapData(username);

        // TODO: test validations
    }
    
    /**
     * get an OAuth2 Application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetOAuth2ApplicationTest() throws ApiException {
        Long id = null;
        // OAuth2Application response = api.userGetOAuth2Application(id);

        // TODO: test validations
    }
    
    /**
     * List the authenticated user&#39;s oauth2 applications
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetOauth2ApplicationTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        // List<OAuth2Application> response = api.userGetOauth2Application(page, limit);

        // TODO: test validations
    }
    
    /**
     * Get list of all existing stopwatches
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetStopWatchesTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        // List<StopWatch> response = api.userGetStopWatches(page, limit);

        // TODO: test validations
    }
    
    /**
     * List the authenticated user&#39;s access tokens
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetTokensTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        // List<AccessToken> response = api.userGetTokens(username, page, limit);

        // TODO: test validations
    }
    
    /**
     * List the authenticated user&#39;s email addresses
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListEmailsTest() throws ApiException {
        // List<Email> response = api.userListEmails();

        // TODO: test validations
    }
    
    /**
     * List the given user&#39;s followers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListFollowersTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        // List<User> response = api.userListFollowers(username, page, limit);

        // TODO: test validations
    }
    
    /**
     * List the users that the given user is following
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListFollowingTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        // List<User> response = api.userListFollowing(username, page, limit);

        // TODO: test validations
    }
    
    /**
     * List the given user&#39;s GPG keys
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListGPGKeysTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        // List<GPGKey> response = api.userListGPGKeys(username, page, limit);

        // TODO: test validations
    }
    
    /**
     * List the given user&#39;s public keys
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListKeysTest() throws ApiException {
        String username = null;
        String fingerprint = null;
        Integer page = null;
        Integer limit = null;
        // List<PublicKey> response = api.userListKeys(username, fingerprint, page, limit);

        // TODO: test validations
    }
    
    /**
     * List the repos owned by the given user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListReposTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        // List<Repository> response = api.userListRepos(username, page, limit);

        // TODO: test validations
    }
    
    /**
     * The repos that the given user has starred
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListStarredTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        // List<Repository> response = api.userListStarred(username, page, limit);

        // TODO: test validations
    }
    
    /**
     * List the repositories watched by a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListSubscriptionsTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        // List<Repository> response = api.userListSubscriptions(username, page, limit);

        // TODO: test validations
    }
    
    /**
     * List all the teams a user belongs to
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListTeamsTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        // List<Team> response = api.userListTeams(page, limit);

        // TODO: test validations
    }
    
    /**
     * Search for users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userSearchTest() throws ApiException {
        String q = null;
        Long uid = null;
        Integer page = null;
        Integer limit = null;
        // InlineResponse2001 response = api.userSearch(q, uid, page, limit);

        // TODO: test validations
    }
    
    /**
     * update an OAuth2 Application, this includes regenerating the client secret
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userUpdateOAuth2ApplicationTest() throws ApiException {
        Long id = null;
        CreateOAuth2ApplicationOptions body = null;
        // OAuth2Application response = api.userUpdateOAuth2Application(id, body);

        // TODO: test validations
    }
    
    /**
     * Verify a GPG key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userVerifyGPGKeyTest() throws ApiException {
        // GPGKey response = api.userVerifyGPGKey();

        // TODO: test validations
    }
    
}
