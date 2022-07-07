# gitea-java-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>gitea-java-api</artifactId>
    <version>1.16.8</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:gitea-java-api:1.16.8"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/gitea-java-api-1.16.8.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.gitea.*;
import com.gitea.auth.*;
import com.gitea.model.*;
import com.gitea.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: TOTPHeader
        ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
        TOTPHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TOTPHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: AuthorizationHeaderToken
        ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
        AuthorizationHeaderToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AuthorizationHeaderToken.setApiKeyPrefix("Token");

        // Configure API key authorization: SudoHeader
        ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
        SudoHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //SudoHeader.setApiKeyPrefix("Token");

        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: AccessToken
        ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
        AccessToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AccessToken.setApiKeyPrefix("Token");

        // Configure API key authorization: SudoParam
        ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
        SudoParam.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //SudoParam.setApiKeyPrefix("Token");

        // Configure API key authorization: Token
        ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
        Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Token.setApiKeyPrefix("Token");

        AdminApi apiInstance = new AdminApi();
        String owner = "owner_example"; // String | owner of the repo
        String repo = "repo_example"; // String | name of the repo
        try {
            apiInstance.adminAdoptRepository(owner, repo);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminAdoptRepository");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**adminAdoptRepository**](docs/AdminApi.md#adminAdoptRepository) | **POST** /admin/unadopted/{owner}/{repo} | Adopt unadopted files as a repository
*AdminApi* | [**adminCreateOrg**](docs/AdminApi.md#adminCreateOrg) | **POST** /admin/users/{username}/orgs | Create an organization
*AdminApi* | [**adminCreatePublicKey**](docs/AdminApi.md#adminCreatePublicKey) | **POST** /admin/users/{username}/keys | Add a public key on behalf of a user
*AdminApi* | [**adminCreateRepo**](docs/AdminApi.md#adminCreateRepo) | **POST** /admin/users/{username}/repos | Create a repository on behalf of a user
*AdminApi* | [**adminCreateUser**](docs/AdminApi.md#adminCreateUser) | **POST** /admin/users | Create a user
*AdminApi* | [**adminCronList**](docs/AdminApi.md#adminCronList) | **GET** /admin/cron | List cron tasks
*AdminApi* | [**adminCronRun**](docs/AdminApi.md#adminCronRun) | **POST** /admin/cron/{task} | Run cron task
*AdminApi* | [**adminDeleteUnadoptedRepository**](docs/AdminApi.md#adminDeleteUnadoptedRepository) | **DELETE** /admin/unadopted/{owner}/{repo} | Delete unadopted files
*AdminApi* | [**adminDeleteUser**](docs/AdminApi.md#adminDeleteUser) | **DELETE** /admin/users/{username} | Delete a user
*AdminApi* | [**adminDeleteUserPublicKey**](docs/AdminApi.md#adminDeleteUserPublicKey) | **DELETE** /admin/users/{username}/keys/{id} | Delete a user&#39;s public key
*AdminApi* | [**adminEditUser**](docs/AdminApi.md#adminEditUser) | **PATCH** /admin/users/{username} | Edit an existing user
*AdminApi* | [**adminGetAllOrgs**](docs/AdminApi.md#adminGetAllOrgs) | **GET** /admin/orgs | List all organizations
*AdminApi* | [**adminGetAllUsers**](docs/AdminApi.md#adminGetAllUsers) | **GET** /admin/users | List all users
*AdminApi* | [**adminUnadoptedList**](docs/AdminApi.md#adminUnadoptedList) | **GET** /admin/unadopted | List unadopted repositories
*IssueApi* | [**issueAddLabel**](docs/IssueApi.md#issueAddLabel) | **POST** /repos/{owner}/{repo}/issues/{index}/labels | Add a label to an issue
*IssueApi* | [**issueAddSubscription**](docs/IssueApi.md#issueAddSubscription) | **PUT** /repos/{owner}/{repo}/issues/{index}/subscriptions/{user} | Subscribe user to issue
*IssueApi* | [**issueAddTime**](docs/IssueApi.md#issueAddTime) | **POST** /repos/{owner}/{repo}/issues/{index}/times | Add tracked time to a issue
*IssueApi* | [**issueCheckSubscription**](docs/IssueApi.md#issueCheckSubscription) | **GET** /repos/{owner}/{repo}/issues/{index}/subscriptions/check | Check if user is subscribed to an issue
*IssueApi* | [**issueClearLabels**](docs/IssueApi.md#issueClearLabels) | **DELETE** /repos/{owner}/{repo}/issues/{index}/labels | Remove all labels from an issue
*IssueApi* | [**issueCreateComment**](docs/IssueApi.md#issueCreateComment) | **POST** /repos/{owner}/{repo}/issues/{index}/comments | Add a comment to an issue
*IssueApi* | [**issueCreateIssue**](docs/IssueApi.md#issueCreateIssue) | **POST** /repos/{owner}/{repo}/issues | Create an issue. If using deadline only the date will be taken into account, and time of day ignored.
*IssueApi* | [**issueCreateLabel**](docs/IssueApi.md#issueCreateLabel) | **POST** /repos/{owner}/{repo}/labels | Create a label
*IssueApi* | [**issueCreateMilestone**](docs/IssueApi.md#issueCreateMilestone) | **POST** /repos/{owner}/{repo}/milestones | Create a milestone
*IssueApi* | [**issueDelete**](docs/IssueApi.md#issueDelete) | **DELETE** /repos/{owner}/{repo}/issues/{index} | Delete an issue
*IssueApi* | [**issueDeleteComment**](docs/IssueApi.md#issueDeleteComment) | **DELETE** /repos/{owner}/{repo}/issues/comments/{id} | Delete a comment
*IssueApi* | [**issueDeleteCommentDeprecated**](docs/IssueApi.md#issueDeleteCommentDeprecated) | **DELETE** /repos/{owner}/{repo}/issues/{index}/comments/{id} | Delete a comment
*IssueApi* | [**issueDeleteCommentReaction**](docs/IssueApi.md#issueDeleteCommentReaction) | **DELETE** /repos/{owner}/{repo}/issues/comments/{id}/reactions | Remove a reaction from a comment of an issue
*IssueApi* | [**issueDeleteIssueReaction**](docs/IssueApi.md#issueDeleteIssueReaction) | **DELETE** /repos/{owner}/{repo}/issues/{index}/reactions | Remove a reaction from an issue
*IssueApi* | [**issueDeleteLabel**](docs/IssueApi.md#issueDeleteLabel) | **DELETE** /repos/{owner}/{repo}/labels/{id} | Delete a label
*IssueApi* | [**issueDeleteMilestone**](docs/IssueApi.md#issueDeleteMilestone) | **DELETE** /repos/{owner}/{repo}/milestones/{id} | Delete a milestone
*IssueApi* | [**issueDeleteStopWatch**](docs/IssueApi.md#issueDeleteStopWatch) | **DELETE** /repos/{owner}/{repo}/issues/{index}/stopwatch/delete | Delete an issue&#39;s existing stopwatch.
*IssueApi* | [**issueDeleteSubscription**](docs/IssueApi.md#issueDeleteSubscription) | **DELETE** /repos/{owner}/{repo}/issues/{index}/subscriptions/{user} | Unsubscribe user from issue
*IssueApi* | [**issueDeleteTime**](docs/IssueApi.md#issueDeleteTime) | **DELETE** /repos/{owner}/{repo}/issues/{index}/times/{id} | Delete specific tracked time
*IssueApi* | [**issueEditComment**](docs/IssueApi.md#issueEditComment) | **PATCH** /repos/{owner}/{repo}/issues/comments/{id} | Edit a comment
*IssueApi* | [**issueEditCommentDeprecated**](docs/IssueApi.md#issueEditCommentDeprecated) | **PATCH** /repos/{owner}/{repo}/issues/{index}/comments/{id} | Edit a comment
*IssueApi* | [**issueEditIssue**](docs/IssueApi.md#issueEditIssue) | **PATCH** /repos/{owner}/{repo}/issues/{index} | Edit an issue. If using deadline only the date will be taken into account, and time of day ignored.
*IssueApi* | [**issueEditIssueDeadline**](docs/IssueApi.md#issueEditIssueDeadline) | **POST** /repos/{owner}/{repo}/issues/{index}/deadline | Set an issue deadline. If set to null, the deadline is deleted. If using deadline only the date will be taken into account, and time of day ignored.
*IssueApi* | [**issueEditLabel**](docs/IssueApi.md#issueEditLabel) | **PATCH** /repos/{owner}/{repo}/labels/{id} | Update a label
*IssueApi* | [**issueEditMilestone**](docs/IssueApi.md#issueEditMilestone) | **PATCH** /repos/{owner}/{repo}/milestones/{id} | Update a milestone
*IssueApi* | [**issueGetComment**](docs/IssueApi.md#issueGetComment) | **GET** /repos/{owner}/{repo}/issues/comments/{id} | Get a comment
*IssueApi* | [**issueGetCommentReactions**](docs/IssueApi.md#issueGetCommentReactions) | **GET** /repos/{owner}/{repo}/issues/comments/{id}/reactions | Get a list of reactions from a comment of an issue
*IssueApi* | [**issueGetComments**](docs/IssueApi.md#issueGetComments) | **GET** /repos/{owner}/{repo}/issues/{index}/comments | List all comments on an issue
*IssueApi* | [**issueGetCommentsAndTimeline**](docs/IssueApi.md#issueGetCommentsAndTimeline) | **GET** /repos/{owner}/{repo}/issues/{index}/timeline | List all comments and events on an issue
*IssueApi* | [**issueGetIssue**](docs/IssueApi.md#issueGetIssue) | **GET** /repos/{owner}/{repo}/issues/{index} | Get an issue
*IssueApi* | [**issueGetIssueReactions**](docs/IssueApi.md#issueGetIssueReactions) | **GET** /repos/{owner}/{repo}/issues/{index}/reactions | Get a list reactions of an issue
*IssueApi* | [**issueGetLabel**](docs/IssueApi.md#issueGetLabel) | **GET** /repos/{owner}/{repo}/labels/{id} | Get a single label
*IssueApi* | [**issueGetLabels**](docs/IssueApi.md#issueGetLabels) | **GET** /repos/{owner}/{repo}/issues/{index}/labels | Get an issue&#39;s labels
*IssueApi* | [**issueGetMilestone**](docs/IssueApi.md#issueGetMilestone) | **GET** /repos/{owner}/{repo}/milestones/{id} | Get a milestone
*IssueApi* | [**issueGetMilestonesList**](docs/IssueApi.md#issueGetMilestonesList) | **GET** /repos/{owner}/{repo}/milestones | Get all of a repository&#39;s opened milestones
*IssueApi* | [**issueGetRepoComments**](docs/IssueApi.md#issueGetRepoComments) | **GET** /repos/{owner}/{repo}/issues/comments | List all comments in a repository
*IssueApi* | [**issueListIssues**](docs/IssueApi.md#issueListIssues) | **GET** /repos/{owner}/{repo}/issues | List a repository&#39;s issues
*IssueApi* | [**issueListLabels**](docs/IssueApi.md#issueListLabels) | **GET** /repos/{owner}/{repo}/labels | Get all of a repository&#39;s labels
*IssueApi* | [**issuePostCommentReaction**](docs/IssueApi.md#issuePostCommentReaction) | **POST** /repos/{owner}/{repo}/issues/comments/{id}/reactions | Add a reaction to a comment of an issue
*IssueApi* | [**issuePostIssueReaction**](docs/IssueApi.md#issuePostIssueReaction) | **POST** /repos/{owner}/{repo}/issues/{index}/reactions | Add a reaction to an issue
*IssueApi* | [**issueRemoveLabel**](docs/IssueApi.md#issueRemoveLabel) | **DELETE** /repos/{owner}/{repo}/issues/{index}/labels/{id} | Remove a label from an issue
*IssueApi* | [**issueReplaceLabels**](docs/IssueApi.md#issueReplaceLabels) | **PUT** /repos/{owner}/{repo}/issues/{index}/labels | Replace an issue&#39;s labels
*IssueApi* | [**issueResetTime**](docs/IssueApi.md#issueResetTime) | **DELETE** /repos/{owner}/{repo}/issues/{index}/times | Reset a tracked time of an issue
*IssueApi* | [**issueSearchIssues**](docs/IssueApi.md#issueSearchIssues) | **GET** /repos/issues/search | Search for issues across the repositories that the user has access to
*IssueApi* | [**issueStartStopWatch**](docs/IssueApi.md#issueStartStopWatch) | **POST** /repos/{owner}/{repo}/issues/{index}/stopwatch/start | Start stopwatch on an issue.
*IssueApi* | [**issueStopStopWatch**](docs/IssueApi.md#issueStopStopWatch) | **POST** /repos/{owner}/{repo}/issues/{index}/stopwatch/stop | Stop an issue&#39;s existing stopwatch.
*IssueApi* | [**issueSubscriptions**](docs/IssueApi.md#issueSubscriptions) | **GET** /repos/{owner}/{repo}/issues/{index}/subscriptions | Get users who subscribed on an issue.
*IssueApi* | [**issueTrackedTimes**](docs/IssueApi.md#issueTrackedTimes) | **GET** /repos/{owner}/{repo}/issues/{index}/times | List an issue&#39;s tracked times
*MiscellaneousApi* | [**getNodeInfo**](docs/MiscellaneousApi.md#getNodeInfo) | **GET** /nodeinfo | Returns the nodeinfo of the Gitea application
*MiscellaneousApi* | [**getSigningKey**](docs/MiscellaneousApi.md#getSigningKey) | **GET** /signing-key.gpg | Get default signing-key.gpg
*MiscellaneousApi* | [**getVersion**](docs/MiscellaneousApi.md#getVersion) | **GET** /version | Returns the version of the Gitea application
*MiscellaneousApi* | [**renderMarkdown**](docs/MiscellaneousApi.md#renderMarkdown) | **POST** /markdown | Render a markdown document as HTML
*MiscellaneousApi* | [**renderMarkdownRaw**](docs/MiscellaneousApi.md#renderMarkdownRaw) | **POST** /markdown/raw | Render raw markdown as HTML
*NotificationApi* | [**notifyGetList**](docs/NotificationApi.md#notifyGetList) | **GET** /notifications | List users&#39;s notification threads
*NotificationApi* | [**notifyGetRepoList**](docs/NotificationApi.md#notifyGetRepoList) | **GET** /repos/{owner}/{repo}/notifications | List users&#39;s notification threads on a specific repo
*NotificationApi* | [**notifyGetThread**](docs/NotificationApi.md#notifyGetThread) | **GET** /notifications/threads/{id} | Get notification thread by ID
*NotificationApi* | [**notifyNewAvailable**](docs/NotificationApi.md#notifyNewAvailable) | **GET** /notifications/new | Check if unread notifications exist
*NotificationApi* | [**notifyReadList**](docs/NotificationApi.md#notifyReadList) | **PUT** /notifications | Mark notification threads as read, pinned or unread
*NotificationApi* | [**notifyReadRepoList**](docs/NotificationApi.md#notifyReadRepoList) | **PUT** /repos/{owner}/{repo}/notifications | Mark notification threads as read, pinned or unread on a specific repo
*NotificationApi* | [**notifyReadThread**](docs/NotificationApi.md#notifyReadThread) | **PATCH** /notifications/threads/{id} | Mark notification thread as read by ID
*OrganizationApi* | [**createOrgRepo**](docs/OrganizationApi.md#createOrgRepo) | **POST** /orgs/{org}/repos | Create a repository in an organization
*OrganizationApi* | [**createOrgRepoDeprecated**](docs/OrganizationApi.md#createOrgRepoDeprecated) | **POST** /org/{org}/repos | Create a repository in an organization
*OrganizationApi* | [**orgAddTeamMember**](docs/OrganizationApi.md#orgAddTeamMember) | **PUT** /teams/{id}/members/{username} | Add a team member
*OrganizationApi* | [**orgAddTeamRepository**](docs/OrganizationApi.md#orgAddTeamRepository) | **PUT** /teams/{id}/repos/{org}/{repo} | Add a repository to a team
*OrganizationApi* | [**orgConcealMember**](docs/OrganizationApi.md#orgConcealMember) | **DELETE** /orgs/{org}/public_members/{username} | Conceal a user&#39;s membership
*OrganizationApi* | [**orgCreate**](docs/OrganizationApi.md#orgCreate) | **POST** /orgs | Create an organization
*OrganizationApi* | [**orgCreateHook**](docs/OrganizationApi.md#orgCreateHook) | **POST** /orgs/{org}/hooks/ | Create a hook
*OrganizationApi* | [**orgCreateLabel**](docs/OrganizationApi.md#orgCreateLabel) | **POST** /orgs/{org}/labels | Create a label for an organization
*OrganizationApi* | [**orgCreateTeam**](docs/OrganizationApi.md#orgCreateTeam) | **POST** /orgs/{org}/teams | Create a team
*OrganizationApi* | [**orgDelete**](docs/OrganizationApi.md#orgDelete) | **DELETE** /orgs/{org} | Delete an organization
*OrganizationApi* | [**orgDeleteHook**](docs/OrganizationApi.md#orgDeleteHook) | **DELETE** /orgs/{org}/hooks/{id} | Delete a hook
*OrganizationApi* | [**orgDeleteLabel**](docs/OrganizationApi.md#orgDeleteLabel) | **DELETE** /orgs/{org}/labels/{id} | Delete a label
*OrganizationApi* | [**orgDeleteMember**](docs/OrganizationApi.md#orgDeleteMember) | **DELETE** /orgs/{org}/members/{username} | Remove a member from an organization
*OrganizationApi* | [**orgDeleteTeam**](docs/OrganizationApi.md#orgDeleteTeam) | **DELETE** /teams/{id} | Delete a team
*OrganizationApi* | [**orgEdit**](docs/OrganizationApi.md#orgEdit) | **PATCH** /orgs/{org} | Edit an organization
*OrganizationApi* | [**orgEditHook**](docs/OrganizationApi.md#orgEditHook) | **PATCH** /orgs/{org}/hooks/{id} | Update a hook
*OrganizationApi* | [**orgEditLabel**](docs/OrganizationApi.md#orgEditLabel) | **PATCH** /orgs/{org}/labels/{id} | Update a label
*OrganizationApi* | [**orgEditTeam**](docs/OrganizationApi.md#orgEditTeam) | **PATCH** /teams/{id} | Edit a team
*OrganizationApi* | [**orgGet**](docs/OrganizationApi.md#orgGet) | **GET** /orgs/{org} | Get an organization
*OrganizationApi* | [**orgGetAll**](docs/OrganizationApi.md#orgGetAll) | **GET** /orgs | Get list of organizations
*OrganizationApi* | [**orgGetHook**](docs/OrganizationApi.md#orgGetHook) | **GET** /orgs/{org}/hooks/{id} | Get a hook
*OrganizationApi* | [**orgGetLabel**](docs/OrganizationApi.md#orgGetLabel) | **GET** /orgs/{org}/labels/{id} | Get a single label
*OrganizationApi* | [**orgGetTeam**](docs/OrganizationApi.md#orgGetTeam) | **GET** /teams/{id} | Get a team
*OrganizationApi* | [**orgGetUserPermissions**](docs/OrganizationApi.md#orgGetUserPermissions) | **GET** /users/{username}/orgs/{org}/permissions | Get user permissions in organization
*OrganizationApi* | [**orgIsMember**](docs/OrganizationApi.md#orgIsMember) | **GET** /orgs/{org}/members/{username} | Check if a user is a member of an organization
*OrganizationApi* | [**orgIsPublicMember**](docs/OrganizationApi.md#orgIsPublicMember) | **GET** /orgs/{org}/public_members/{username} | Check if a user is a public member of an organization
*OrganizationApi* | [**orgListCurrentUserOrgs**](docs/OrganizationApi.md#orgListCurrentUserOrgs) | **GET** /user/orgs | List the current user&#39;s organizations
*OrganizationApi* | [**orgListHooks**](docs/OrganizationApi.md#orgListHooks) | **GET** /orgs/{org}/hooks | List an organization&#39;s webhooks
*OrganizationApi* | [**orgListLabels**](docs/OrganizationApi.md#orgListLabels) | **GET** /orgs/{org}/labels | List an organization&#39;s labels
*OrganizationApi* | [**orgListMembers**](docs/OrganizationApi.md#orgListMembers) | **GET** /orgs/{org}/members | List an organization&#39;s members
*OrganizationApi* | [**orgListPublicMembers**](docs/OrganizationApi.md#orgListPublicMembers) | **GET** /orgs/{org}/public_members | List an organization&#39;s public members
*OrganizationApi* | [**orgListRepos**](docs/OrganizationApi.md#orgListRepos) | **GET** /orgs/{org}/repos | List an organization&#39;s repos
*OrganizationApi* | [**orgListTeamMember**](docs/OrganizationApi.md#orgListTeamMember) | **GET** /teams/{id}/members/{username} | List a particular member of team
*OrganizationApi* | [**orgListTeamMembers**](docs/OrganizationApi.md#orgListTeamMembers) | **GET** /teams/{id}/members | List a team&#39;s members
*OrganizationApi* | [**orgListTeamRepos**](docs/OrganizationApi.md#orgListTeamRepos) | **GET** /teams/{id}/repos | List a team&#39;s repos
*OrganizationApi* | [**orgListTeams**](docs/OrganizationApi.md#orgListTeams) | **GET** /orgs/{org}/teams | List an organization&#39;s teams
*OrganizationApi* | [**orgListUserOrgs**](docs/OrganizationApi.md#orgListUserOrgs) | **GET** /users/{username}/orgs | List a user&#39;s organizations
*OrganizationApi* | [**orgPublicizeMember**](docs/OrganizationApi.md#orgPublicizeMember) | **PUT** /orgs/{org}/public_members/{username} | Publicize a user&#39;s membership
*OrganizationApi* | [**orgRemoveTeamMember**](docs/OrganizationApi.md#orgRemoveTeamMember) | **DELETE** /teams/{id}/members/{username} | Remove a team member
*OrganizationApi* | [**orgRemoveTeamRepository**](docs/OrganizationApi.md#orgRemoveTeamRepository) | **DELETE** /teams/{id}/repos/{org}/{repo} | Remove a repository from a team
*OrganizationApi* | [**teamSearch**](docs/OrganizationApi.md#teamSearch) | **GET** /orgs/{org}/teams/search | Search for teams within an organization
*RepositoryApi* | [**acceptRepoTransfer**](docs/RepositoryApi.md#acceptRepoTransfer) | **POST** /repos/{owner}/{repo}/transfer/accept | Accept a repo transfer
*RepositoryApi* | [**createCurrentUserRepo**](docs/RepositoryApi.md#createCurrentUserRepo) | **POST** /user/repos | Create a repository
*RepositoryApi* | [**createFork**](docs/RepositoryApi.md#createFork) | **POST** /repos/{owner}/{repo}/forks | Fork a repository
*RepositoryApi* | [**generateRepo**](docs/RepositoryApi.md#generateRepo) | **POST** /repos/{template_owner}/{template_repo}/generate | Create a repository using a template
*RepositoryApi* | [**getAnnotatedTag**](docs/RepositoryApi.md#getAnnotatedTag) | **GET** /repos/{owner}/{repo}/git/tags/{sha} | Gets the tag object of an annotated tag (not lightweight tags)
*RepositoryApi* | [**getBlob**](docs/RepositoryApi.md#getBlob) | **GET** /repos/{owner}/{repo}/git/blobs/{sha} | Gets the blob of a repository.
*RepositoryApi* | [**getTree**](docs/RepositoryApi.md#getTree) | **GET** /repos/{owner}/{repo}/git/trees/{sha} | Gets the tree of a repository.
*RepositoryApi* | [**listForks**](docs/RepositoryApi.md#listForks) | **GET** /repos/{owner}/{repo}/forks | List a repository&#39;s forks
*RepositoryApi* | [**rejectRepoTransfer**](docs/RepositoryApi.md#rejectRepoTransfer) | **POST** /repos/{owner}/{repo}/transfer/reject | Reject a repo transfer
*RepositoryApi* | [**repoAddCollaborator**](docs/RepositoryApi.md#repoAddCollaborator) | **PUT** /repos/{owner}/{repo}/collaborators/{collaborator} | Add a collaborator to a repository
*RepositoryApi* | [**repoAddTeam**](docs/RepositoryApi.md#repoAddTeam) | **PUT** /repos/{owner}/{repo}/teams/{team} | Add a team to a repository
*RepositoryApi* | [**repoAddTopic**](docs/RepositoryApi.md#repoAddTopic) | **PUT** /repos/{owner}/{repo}/topics/{topic} | Add a topic to a repository
*RepositoryApi* | [**repoCheckCollaborator**](docs/RepositoryApi.md#repoCheckCollaborator) | **GET** /repos/{owner}/{repo}/collaborators/{collaborator} | Check if a user is a collaborator of a repository
*RepositoryApi* | [**repoCheckTeam**](docs/RepositoryApi.md#repoCheckTeam) | **GET** /repos/{owner}/{repo}/teams/{team} | Check if a team is assigned to a repository
*RepositoryApi* | [**repoCreateBranch**](docs/RepositoryApi.md#repoCreateBranch) | **POST** /repos/{owner}/{repo}/branches | Create a branch
*RepositoryApi* | [**repoCreateBranchProtection**](docs/RepositoryApi.md#repoCreateBranchProtection) | **POST** /repos/{owner}/{repo}/branch_protections | Create a branch protections for a repository
*RepositoryApi* | [**repoCreateFile**](docs/RepositoryApi.md#repoCreateFile) | **POST** /repos/{owner}/{repo}/contents/{filepath} | Create a file in a repository
*RepositoryApi* | [**repoCreateHook**](docs/RepositoryApi.md#repoCreateHook) | **POST** /repos/{owner}/{repo}/hooks | Create a hook
*RepositoryApi* | [**repoCreateKey**](docs/RepositoryApi.md#repoCreateKey) | **POST** /repos/{owner}/{repo}/keys | Add a key to a repository
*RepositoryApi* | [**repoCreatePullRequest**](docs/RepositoryApi.md#repoCreatePullRequest) | **POST** /repos/{owner}/{repo}/pulls | Create a pull request
*RepositoryApi* | [**repoCreatePullReview**](docs/RepositoryApi.md#repoCreatePullReview) | **POST** /repos/{owner}/{repo}/pulls/{index}/reviews | Create a review to an pull request
*RepositoryApi* | [**repoCreatePullReviewRequests**](docs/RepositoryApi.md#repoCreatePullReviewRequests) | **POST** /repos/{owner}/{repo}/pulls/{index}/requested_reviewers | create review requests for a pull request
*RepositoryApi* | [**repoCreateRelease**](docs/RepositoryApi.md#repoCreateRelease) | **POST** /repos/{owner}/{repo}/releases | Create a release
*RepositoryApi* | [**repoCreateReleaseAttachment**](docs/RepositoryApi.md#repoCreateReleaseAttachment) | **POST** /repos/{owner}/{repo}/releases/{id}/assets | Create a release attachment
*RepositoryApi* | [**repoCreateStatus**](docs/RepositoryApi.md#repoCreateStatus) | **POST** /repos/{owner}/{repo}/statuses/{sha} | Create a commit status
*RepositoryApi* | [**repoCreateTag**](docs/RepositoryApi.md#repoCreateTag) | **POST** /repos/{owner}/{repo}/tags | Create a new git tag in a repository
*RepositoryApi* | [**repoCreateWikiPage**](docs/RepositoryApi.md#repoCreateWikiPage) | **POST** /repos/{owner}/{repo}/wiki/new | Create a wiki page
*RepositoryApi* | [**repoDelete**](docs/RepositoryApi.md#repoDelete) | **DELETE** /repos/{owner}/{repo} | Delete a repository
*RepositoryApi* | [**repoDeleteBranch**](docs/RepositoryApi.md#repoDeleteBranch) | **DELETE** /repos/{owner}/{repo}/branches/{branch} | Delete a specific branch from a repository
*RepositoryApi* | [**repoDeleteBranchProtection**](docs/RepositoryApi.md#repoDeleteBranchProtection) | **DELETE** /repos/{owner}/{repo}/branch_protections/{name} | Delete a specific branch protection for the repository
*RepositoryApi* | [**repoDeleteCollaborator**](docs/RepositoryApi.md#repoDeleteCollaborator) | **DELETE** /repos/{owner}/{repo}/collaborators/{collaborator} | Delete a collaborator from a repository
*RepositoryApi* | [**repoDeleteFile**](docs/RepositoryApi.md#repoDeleteFile) | **DELETE** /repos/{owner}/{repo}/contents/{filepath} | Delete a file in a repository
*RepositoryApi* | [**repoDeleteGitHook**](docs/RepositoryApi.md#repoDeleteGitHook) | **DELETE** /repos/{owner}/{repo}/hooks/git/{id} | Delete a Git hook in a repository
*RepositoryApi* | [**repoDeleteHook**](docs/RepositoryApi.md#repoDeleteHook) | **DELETE** /repos/{owner}/{repo}/hooks/{id} | Delete a hook in a repository
*RepositoryApi* | [**repoDeleteKey**](docs/RepositoryApi.md#repoDeleteKey) | **DELETE** /repos/{owner}/{repo}/keys/{id} | Delete a key from a repository
*RepositoryApi* | [**repoDeletePullReview**](docs/RepositoryApi.md#repoDeletePullReview) | **DELETE** /repos/{owner}/{repo}/pulls/{index}/reviews/{id} | Delete a specific review from a pull request
*RepositoryApi* | [**repoDeletePullReviewRequests**](docs/RepositoryApi.md#repoDeletePullReviewRequests) | **DELETE** /repos/{owner}/{repo}/pulls/{index}/requested_reviewers | cancel review requests for a pull request
*RepositoryApi* | [**repoDeleteRelease**](docs/RepositoryApi.md#repoDeleteRelease) | **DELETE** /repos/{owner}/{repo}/releases/{id} | Delete a release
*RepositoryApi* | [**repoDeleteReleaseAttachment**](docs/RepositoryApi.md#repoDeleteReleaseAttachment) | **DELETE** /repos/{owner}/{repo}/releases/{id}/assets/{attachment_id} | Delete a release attachment
*RepositoryApi* | [**repoDeleteReleaseByTag**](docs/RepositoryApi.md#repoDeleteReleaseByTag) | **DELETE** /repos/{owner}/{repo}/releases/tags/{tag} | Delete a release by tag name
*RepositoryApi* | [**repoDeleteTag**](docs/RepositoryApi.md#repoDeleteTag) | **DELETE** /repos/{owner}/{repo}/tags/{tag} | Delete a repository&#39;s tag by name
*RepositoryApi* | [**repoDeleteTeam**](docs/RepositoryApi.md#repoDeleteTeam) | **DELETE** /repos/{owner}/{repo}/teams/{team} | Delete a team from a repository
*RepositoryApi* | [**repoDeleteTopic**](docs/RepositoryApi.md#repoDeleteTopic) | **DELETE** /repos/{owner}/{repo}/topics/{topic} | Delete a topic from a repository
*RepositoryApi* | [**repoDeleteWikiPage**](docs/RepositoryApi.md#repoDeleteWikiPage) | **DELETE** /repos/{owner}/{repo}/wiki/page/{pageName} | Delete a wiki page
*RepositoryApi* | [**repoDismissPullReview**](docs/RepositoryApi.md#repoDismissPullReview) | **POST** /repos/{owner}/{repo}/pulls/{index}/reviews/{id}/dismissals | Dismiss a review for a pull request
*RepositoryApi* | [**repoDownloadCommitDiffOrPatch**](docs/RepositoryApi.md#repoDownloadCommitDiffOrPatch) | **GET** /repos/{owner}/{repo}/git/commits/{sha}.{diffType} | Get a commit&#39;s diff or patch
*RepositoryApi* | [**repoDownloadPullDiffOrPatch**](docs/RepositoryApi.md#repoDownloadPullDiffOrPatch) | **GET** /repos/{owner}/{repo}/pulls/{index}.{diffType} | Get a pull request diff or patch
*RepositoryApi* | [**repoEdit**](docs/RepositoryApi.md#repoEdit) | **PATCH** /repos/{owner}/{repo} | Edit a repository&#39;s properties. Only fields that are set will be changed.
*RepositoryApi* | [**repoEditBranchProtection**](docs/RepositoryApi.md#repoEditBranchProtection) | **PATCH** /repos/{owner}/{repo}/branch_protections/{name} | Edit a branch protections for a repository. Only fields that are set will be changed
*RepositoryApi* | [**repoEditGitHook**](docs/RepositoryApi.md#repoEditGitHook) | **PATCH** /repos/{owner}/{repo}/hooks/git/{id} | Edit a Git hook in a repository
*RepositoryApi* | [**repoEditHook**](docs/RepositoryApi.md#repoEditHook) | **PATCH** /repos/{owner}/{repo}/hooks/{id} | Edit a hook in a repository
*RepositoryApi* | [**repoEditPullRequest**](docs/RepositoryApi.md#repoEditPullRequest) | **PATCH** /repos/{owner}/{repo}/pulls/{index} | Update a pull request. If using deadline only the date will be taken into account, and time of day ignored.
*RepositoryApi* | [**repoEditRelease**](docs/RepositoryApi.md#repoEditRelease) | **PATCH** /repos/{owner}/{repo}/releases/{id} | Update a release
*RepositoryApi* | [**repoEditReleaseAttachment**](docs/RepositoryApi.md#repoEditReleaseAttachment) | **PATCH** /repos/{owner}/{repo}/releases/{id}/assets/{attachment_id} | Edit a release attachment
*RepositoryApi* | [**repoEditWikiPage**](docs/RepositoryApi.md#repoEditWikiPage) | **PATCH** /repos/{owner}/{repo}/wiki/page/{pageName} | Edit a wiki page
*RepositoryApi* | [**repoGet**](docs/RepositoryApi.md#repoGet) | **GET** /repos/{owner}/{repo} | Get a repository
*RepositoryApi* | [**repoGetAllCommits**](docs/RepositoryApi.md#repoGetAllCommits) | **GET** /repos/{owner}/{repo}/commits | Get a list of all commits from a repository
*RepositoryApi* | [**repoGetArchive**](docs/RepositoryApi.md#repoGetArchive) | **GET** /repos/{owner}/{repo}/archive/{archive} | Get an archive of a repository
*RepositoryApi* | [**repoGetAssignees**](docs/RepositoryApi.md#repoGetAssignees) | **GET** /repos/{owner}/{repo}/assignees | Return all users that have write access and can be assigned to issues
*RepositoryApi* | [**repoGetBranch**](docs/RepositoryApi.md#repoGetBranch) | **GET** /repos/{owner}/{repo}/branches/{branch} | Retrieve a specific branch from a repository, including its effective branch protection
*RepositoryApi* | [**repoGetBranchProtection**](docs/RepositoryApi.md#repoGetBranchProtection) | **GET** /repos/{owner}/{repo}/branch_protections/{name} | Get a specific branch protection for the repository
*RepositoryApi* | [**repoGetByID**](docs/RepositoryApi.md#repoGetByID) | **GET** /repositories/{id} | Get a repository by id
*RepositoryApi* | [**repoGetCombinedStatusByRef**](docs/RepositoryApi.md#repoGetCombinedStatusByRef) | **GET** /repos/{owner}/{repo}/commits/{ref}/status | Get a commit&#39;s combined status, by branch/tag/commit reference
*RepositoryApi* | [**repoGetContents**](docs/RepositoryApi.md#repoGetContents) | **GET** /repos/{owner}/{repo}/contents/{filepath} | Gets the metadata and contents (if a file) of an entry in a repository, or a list of entries if a dir
*RepositoryApi* | [**repoGetContentsList**](docs/RepositoryApi.md#repoGetContentsList) | **GET** /repos/{owner}/{repo}/contents | Gets the metadata of all the entries of the root dir
*RepositoryApi* | [**repoGetEditorConfig**](docs/RepositoryApi.md#repoGetEditorConfig) | **GET** /repos/{owner}/{repo}/editorconfig/{filepath} | Get the EditorConfig definitions of a file in a repository
*RepositoryApi* | [**repoGetGitHook**](docs/RepositoryApi.md#repoGetGitHook) | **GET** /repos/{owner}/{repo}/hooks/git/{id} | Get a Git hook
*RepositoryApi* | [**repoGetHook**](docs/RepositoryApi.md#repoGetHook) | **GET** /repos/{owner}/{repo}/hooks/{id} | Get a hook
*RepositoryApi* | [**repoGetIssueTemplates**](docs/RepositoryApi.md#repoGetIssueTemplates) | **GET** /repos/{owner}/{repo}/issue_templates | Get available issue templates for a repository
*RepositoryApi* | [**repoGetKey**](docs/RepositoryApi.md#repoGetKey) | **GET** /repos/{owner}/{repo}/keys/{id} | Get a repository&#39;s key by id
*RepositoryApi* | [**repoGetLanguages**](docs/RepositoryApi.md#repoGetLanguages) | **GET** /repos/{owner}/{repo}/languages | Get languages and number of bytes of code written
*RepositoryApi* | [**repoGetNote**](docs/RepositoryApi.md#repoGetNote) | **GET** /repos/{owner}/{repo}/git/notes/{sha} | Get a note corresponding to a single commit from a repository
*RepositoryApi* | [**repoGetPullRequest**](docs/RepositoryApi.md#repoGetPullRequest) | **GET** /repos/{owner}/{repo}/pulls/{index} | Get a pull request
*RepositoryApi* | [**repoGetPullRequestCommits**](docs/RepositoryApi.md#repoGetPullRequestCommits) | **GET** /repos/{owner}/{repo}/pulls/{index}/commits | Get commits for a pull request
*RepositoryApi* | [**repoGetPullReview**](docs/RepositoryApi.md#repoGetPullReview) | **GET** /repos/{owner}/{repo}/pulls/{index}/reviews/{id} | Get a specific review for a pull request
*RepositoryApi* | [**repoGetPullReviewComments**](docs/RepositoryApi.md#repoGetPullReviewComments) | **GET** /repos/{owner}/{repo}/pulls/{index}/reviews/{id}/comments | Get a specific review for a pull request
*RepositoryApi* | [**repoGetRawFile**](docs/RepositoryApi.md#repoGetRawFile) | **GET** /repos/{owner}/{repo}/raw/{filepath} | Get a file from a repository
*RepositoryApi* | [**repoGetRelease**](docs/RepositoryApi.md#repoGetRelease) | **GET** /repos/{owner}/{repo}/releases/{id} | Get a release
*RepositoryApi* | [**repoGetReleaseAttachment**](docs/RepositoryApi.md#repoGetReleaseAttachment) | **GET** /repos/{owner}/{repo}/releases/{id}/assets/{attachment_id} | Get a release attachment
*RepositoryApi* | [**repoGetReleaseByTag**](docs/RepositoryApi.md#repoGetReleaseByTag) | **GET** /repos/{owner}/{repo}/releases/tags/{tag} | Get a release by tag name
*RepositoryApi* | [**repoGetReviewers**](docs/RepositoryApi.md#repoGetReviewers) | **GET** /repos/{owner}/{repo}/reviewers | Return all users that can be requested to review in this repo
*RepositoryApi* | [**repoGetSingleCommit**](docs/RepositoryApi.md#repoGetSingleCommit) | **GET** /repos/{owner}/{repo}/git/commits/{sha} | Get a single commit from a repository
*RepositoryApi* | [**repoGetTag**](docs/RepositoryApi.md#repoGetTag) | **GET** /repos/{owner}/{repo}/tags/{tag} | Get the tag of a repository by tag name
*RepositoryApi* | [**repoGetWikiPage**](docs/RepositoryApi.md#repoGetWikiPage) | **GET** /repos/{owner}/{repo}/wiki/page/{pageName} | Get a wiki page
*RepositoryApi* | [**repoGetWikiPageRevisions**](docs/RepositoryApi.md#repoGetWikiPageRevisions) | **GET** /repos/{owner}/{repo}/wiki/revisions/{pageName} | Get revisions of a wiki page
*RepositoryApi* | [**repoGetWikiPages**](docs/RepositoryApi.md#repoGetWikiPages) | **GET** /repos/{owner}/{repo}/wiki/pages | Get all wiki pages
*RepositoryApi* | [**repoListAllGitRefs**](docs/RepositoryApi.md#repoListAllGitRefs) | **GET** /repos/{owner}/{repo}/git/refs | Get specified ref or filtered repository&#39;s refs
*RepositoryApi* | [**repoListBranchProtection**](docs/RepositoryApi.md#repoListBranchProtection) | **GET** /repos/{owner}/{repo}/branch_protections | List branch protections for a repository
*RepositoryApi* | [**repoListBranches**](docs/RepositoryApi.md#repoListBranches) | **GET** /repos/{owner}/{repo}/branches | List a repository&#39;s branches
*RepositoryApi* | [**repoListCollaborators**](docs/RepositoryApi.md#repoListCollaborators) | **GET** /repos/{owner}/{repo}/collaborators | List a repository&#39;s collaborators
*RepositoryApi* | [**repoListGitHooks**](docs/RepositoryApi.md#repoListGitHooks) | **GET** /repos/{owner}/{repo}/hooks/git | List the Git hooks in a repository
*RepositoryApi* | [**repoListGitRefs**](docs/RepositoryApi.md#repoListGitRefs) | **GET** /repos/{owner}/{repo}/git/refs/{ref} | Get specified ref or filtered repository&#39;s refs
*RepositoryApi* | [**repoListHooks**](docs/RepositoryApi.md#repoListHooks) | **GET** /repos/{owner}/{repo}/hooks | List the hooks in a repository
*RepositoryApi* | [**repoListKeys**](docs/RepositoryApi.md#repoListKeys) | **GET** /repos/{owner}/{repo}/keys | List a repository&#39;s keys
*RepositoryApi* | [**repoListPullRequests**](docs/RepositoryApi.md#repoListPullRequests) | **GET** /repos/{owner}/{repo}/pulls | List a repo&#39;s pull requests
*RepositoryApi* | [**repoListPullReviews**](docs/RepositoryApi.md#repoListPullReviews) | **GET** /repos/{owner}/{repo}/pulls/{index}/reviews | List all reviews for a pull request
*RepositoryApi* | [**repoListReleaseAttachments**](docs/RepositoryApi.md#repoListReleaseAttachments) | **GET** /repos/{owner}/{repo}/releases/{id}/assets | List release&#39;s attachments
*RepositoryApi* | [**repoListReleases**](docs/RepositoryApi.md#repoListReleases) | **GET** /repos/{owner}/{repo}/releases | List a repo&#39;s releases
*RepositoryApi* | [**repoListStargazers**](docs/RepositoryApi.md#repoListStargazers) | **GET** /repos/{owner}/{repo}/stargazers | List a repo&#39;s stargazers
*RepositoryApi* | [**repoListStatuses**](docs/RepositoryApi.md#repoListStatuses) | **GET** /repos/{owner}/{repo}/statuses/{sha} | Get a commit&#39;s statuses
*RepositoryApi* | [**repoListStatusesByRef**](docs/RepositoryApi.md#repoListStatusesByRef) | **GET** /repos/{owner}/{repo}/commits/{ref}/statuses | Get a commit&#39;s statuses, by branch/tag/commit reference
*RepositoryApi* | [**repoListSubscribers**](docs/RepositoryApi.md#repoListSubscribers) | **GET** /repos/{owner}/{repo}/subscribers | List a repo&#39;s watchers
*RepositoryApi* | [**repoListTags**](docs/RepositoryApi.md#repoListTags) | **GET** /repos/{owner}/{repo}/tags | List a repository&#39;s tags
*RepositoryApi* | [**repoListTeams**](docs/RepositoryApi.md#repoListTeams) | **GET** /repos/{owner}/{repo}/teams | List a repository&#39;s teams
*RepositoryApi* | [**repoListTopics**](docs/RepositoryApi.md#repoListTopics) | **GET** /repos/{owner}/{repo}/topics | Get list of topics that a repository has
*RepositoryApi* | [**repoMergePullRequest**](docs/RepositoryApi.md#repoMergePullRequest) | **POST** /repos/{owner}/{repo}/pulls/{index}/merge | Merge a pull request
*RepositoryApi* | [**repoMigrate**](docs/RepositoryApi.md#repoMigrate) | **POST** /repos/migrate | Migrate a remote git repository
*RepositoryApi* | [**repoMirrorSync**](docs/RepositoryApi.md#repoMirrorSync) | **POST** /repos/{owner}/{repo}/mirror-sync | Sync a mirrored repository
*RepositoryApi* | [**repoPullRequestIsMerged**](docs/RepositoryApi.md#repoPullRequestIsMerged) | **GET** /repos/{owner}/{repo}/pulls/{index}/merge | Check if a pull request has been merged
*RepositoryApi* | [**repoSearch**](docs/RepositoryApi.md#repoSearch) | **GET** /repos/search | Search for repositories
*RepositoryApi* | [**repoSigningKey**](docs/RepositoryApi.md#repoSigningKey) | **GET** /repos/{owner}/{repo}/signing-key.gpg | Get signing-key.gpg for given repository
*RepositoryApi* | [**repoSubmitPullReview**](docs/RepositoryApi.md#repoSubmitPullReview) | **POST** /repos/{owner}/{repo}/pulls/{index}/reviews/{id} | Submit a pending review to an pull request
*RepositoryApi* | [**repoTestHook**](docs/RepositoryApi.md#repoTestHook) | **POST** /repos/{owner}/{repo}/hooks/{id}/tests | Test a push webhook
*RepositoryApi* | [**repoTrackedTimes**](docs/RepositoryApi.md#repoTrackedTimes) | **GET** /repos/{owner}/{repo}/times | List a repo&#39;s tracked times
*RepositoryApi* | [**repoTransfer**](docs/RepositoryApi.md#repoTransfer) | **POST** /repos/{owner}/{repo}/transfer | Transfer a repo ownership
*RepositoryApi* | [**repoUnDismissPullReview**](docs/RepositoryApi.md#repoUnDismissPullReview) | **POST** /repos/{owner}/{repo}/pulls/{index}/reviews/{id}/undismissals | Cancel to dismiss a review for a pull request
*RepositoryApi* | [**repoUpdateFile**](docs/RepositoryApi.md#repoUpdateFile) | **PUT** /repos/{owner}/{repo}/contents/{filepath} | Update a file in a repository
*RepositoryApi* | [**repoUpdatePullRequest**](docs/RepositoryApi.md#repoUpdatePullRequest) | **POST** /repos/{owner}/{repo}/pulls/{index}/update | Merge PR&#39;s baseBranch into headBranch
*RepositoryApi* | [**repoUpdateTopics**](docs/RepositoryApi.md#repoUpdateTopics) | **PUT** /repos/{owner}/{repo}/topics | Replace list of topics for a repository
*RepositoryApi* | [**topicSearch**](docs/RepositoryApi.md#topicSearch) | **GET** /topics/search | search topics via keyword
*RepositoryApi* | [**userCurrentCheckSubscription**](docs/RepositoryApi.md#userCurrentCheckSubscription) | **GET** /repos/{owner}/{repo}/subscription | Check if the current user is watching a repo
*RepositoryApi* | [**userCurrentDeleteSubscription**](docs/RepositoryApi.md#userCurrentDeleteSubscription) | **DELETE** /repos/{owner}/{repo}/subscription | Unwatch a repo
*RepositoryApi* | [**userCurrentPutSubscription**](docs/RepositoryApi.md#userCurrentPutSubscription) | **PUT** /repos/{owner}/{repo}/subscription | Watch a repo
*RepositoryApi* | [**userTrackedTimes**](docs/RepositoryApi.md#userTrackedTimes) | **GET** /repos/{owner}/{repo}/times/{user} | List a user&#39;s tracked times in a repo
*SettingsApi* | [**getGeneralAPISettings**](docs/SettingsApi.md#getGeneralAPISettings) | **GET** /settings/api | Get instance&#39;s global settings for api
*SettingsApi* | [**getGeneralAttachmentSettings**](docs/SettingsApi.md#getGeneralAttachmentSettings) | **GET** /settings/attachment | Get instance&#39;s global settings for Attachment
*SettingsApi* | [**getGeneralRepositorySettings**](docs/SettingsApi.md#getGeneralRepositorySettings) | **GET** /settings/repository | Get instance&#39;s global settings for repositories
*SettingsApi* | [**getGeneralUISettings**](docs/SettingsApi.md#getGeneralUISettings) | **GET** /settings/ui | Get instance&#39;s global settings for ui
*UserApi* | [**createCurrentUserRepo**](docs/UserApi.md#createCurrentUserRepo) | **POST** /user/repos | Create a repository
*UserApi* | [**getUserSettings**](docs/UserApi.md#getUserSettings) | **GET** /user/settings | Get user settings
*UserApi* | [**getVerificationToken**](docs/UserApi.md#getVerificationToken) | **GET** /user/gpg_key_token | Get a Token to verify
*UserApi* | [**updateUserSettings**](docs/UserApi.md#updateUserSettings) | **PATCH** /user/settings | Update user settings
*UserApi* | [**userAddEmail**](docs/UserApi.md#userAddEmail) | **POST** /user/emails | Add email addresses
*UserApi* | [**userCheckFollowing**](docs/UserApi.md#userCheckFollowing) | **GET** /users/{follower}/following/{followee} | Check if one user is following another user
*UserApi* | [**userCreateOAuth2Application**](docs/UserApi.md#userCreateOAuth2Application) | **POST** /user/applications/oauth2 | creates a new OAuth2 application
*UserApi* | [**userCreateToken**](docs/UserApi.md#userCreateToken) | **POST** /users/{username}/tokens | Create an access token
*UserApi* | [**userCurrentCheckFollowing**](docs/UserApi.md#userCurrentCheckFollowing) | **GET** /user/following/{username} | Check whether a user is followed by the authenticated user
*UserApi* | [**userCurrentCheckStarring**](docs/UserApi.md#userCurrentCheckStarring) | **GET** /user/starred/{owner}/{repo} | Whether the authenticated is starring the repo
*UserApi* | [**userCurrentDeleteFollow**](docs/UserApi.md#userCurrentDeleteFollow) | **DELETE** /user/following/{username} | Unfollow a user
*UserApi* | [**userCurrentDeleteGPGKey**](docs/UserApi.md#userCurrentDeleteGPGKey) | **DELETE** /user/gpg_keys/{id} | Remove a GPG key
*UserApi* | [**userCurrentDeleteKey**](docs/UserApi.md#userCurrentDeleteKey) | **DELETE** /user/keys/{id} | Delete a public key
*UserApi* | [**userCurrentDeleteStar**](docs/UserApi.md#userCurrentDeleteStar) | **DELETE** /user/starred/{owner}/{repo} | Unstar the given repo
*UserApi* | [**userCurrentGetGPGKey**](docs/UserApi.md#userCurrentGetGPGKey) | **GET** /user/gpg_keys/{id} | Get a GPG key
*UserApi* | [**userCurrentGetKey**](docs/UserApi.md#userCurrentGetKey) | **GET** /user/keys/{id} | Get a public key
*UserApi* | [**userCurrentListFollowers**](docs/UserApi.md#userCurrentListFollowers) | **GET** /user/followers | List the authenticated user&#39;s followers
*UserApi* | [**userCurrentListFollowing**](docs/UserApi.md#userCurrentListFollowing) | **GET** /user/following | List the users that the authenticated user is following
*UserApi* | [**userCurrentListGPGKeys**](docs/UserApi.md#userCurrentListGPGKeys) | **GET** /user/gpg_keys | List the authenticated user&#39;s GPG keys
*UserApi* | [**userCurrentListKeys**](docs/UserApi.md#userCurrentListKeys) | **GET** /user/keys | List the authenticated user&#39;s public keys
*UserApi* | [**userCurrentListRepos**](docs/UserApi.md#userCurrentListRepos) | **GET** /user/repos | List the repos that the authenticated user owns
*UserApi* | [**userCurrentListStarred**](docs/UserApi.md#userCurrentListStarred) | **GET** /user/starred | The repos that the authenticated user has starred
*UserApi* | [**userCurrentListSubscriptions**](docs/UserApi.md#userCurrentListSubscriptions) | **GET** /user/subscriptions | List repositories watched by the authenticated user
*UserApi* | [**userCurrentPostGPGKey**](docs/UserApi.md#userCurrentPostGPGKey) | **POST** /user/gpg_keys | Create a GPG key
*UserApi* | [**userCurrentPostKey**](docs/UserApi.md#userCurrentPostKey) | **POST** /user/keys | Create a public key
*UserApi* | [**userCurrentPutFollow**](docs/UserApi.md#userCurrentPutFollow) | **PUT** /user/following/{username} | Follow a user
*UserApi* | [**userCurrentPutStar**](docs/UserApi.md#userCurrentPutStar) | **PUT** /user/starred/{owner}/{repo} | Star the given repo
*UserApi* | [**userCurrentTrackedTimes**](docs/UserApi.md#userCurrentTrackedTimes) | **GET** /user/times | List the current user&#39;s tracked times
*UserApi* | [**userDeleteAccessToken**](docs/UserApi.md#userDeleteAccessToken) | **DELETE** /users/{username}/tokens/{token} | delete an access token
*UserApi* | [**userDeleteEmail**](docs/UserApi.md#userDeleteEmail) | **DELETE** /user/emails | Delete email addresses
*UserApi* | [**userDeleteOAuth2Application**](docs/UserApi.md#userDeleteOAuth2Application) | **DELETE** /user/applications/oauth2/{id} | delete an OAuth2 Application
*UserApi* | [**userGet**](docs/UserApi.md#userGet) | **GET** /users/{username} | Get a user
*UserApi* | [**userGetCurrent**](docs/UserApi.md#userGetCurrent) | **GET** /user | Get the authenticated user
*UserApi* | [**userGetHeatmapData**](docs/UserApi.md#userGetHeatmapData) | **GET** /users/{username}/heatmap | Get a user&#39;s heatmap
*UserApi* | [**userGetOAuth2Application**](docs/UserApi.md#userGetOAuth2Application) | **GET** /user/applications/oauth2/{id} | get an OAuth2 Application
*UserApi* | [**userGetOauth2Application**](docs/UserApi.md#userGetOauth2Application) | **GET** /user/applications/oauth2 | List the authenticated user&#39;s oauth2 applications
*UserApi* | [**userGetStopWatches**](docs/UserApi.md#userGetStopWatches) | **GET** /user/stopwatches | Get list of all existing stopwatches
*UserApi* | [**userGetTokens**](docs/UserApi.md#userGetTokens) | **GET** /users/{username}/tokens | List the authenticated user&#39;s access tokens
*UserApi* | [**userListEmails**](docs/UserApi.md#userListEmails) | **GET** /user/emails | List the authenticated user&#39;s email addresses
*UserApi* | [**userListFollowers**](docs/UserApi.md#userListFollowers) | **GET** /users/{username}/followers | List the given user&#39;s followers
*UserApi* | [**userListFollowing**](docs/UserApi.md#userListFollowing) | **GET** /users/{username}/following | List the users that the given user is following
*UserApi* | [**userListGPGKeys**](docs/UserApi.md#userListGPGKeys) | **GET** /users/{username}/gpg_keys | List the given user&#39;s GPG keys
*UserApi* | [**userListKeys**](docs/UserApi.md#userListKeys) | **GET** /users/{username}/keys | List the given user&#39;s public keys
*UserApi* | [**userListRepos**](docs/UserApi.md#userListRepos) | **GET** /users/{username}/repos | List the repos owned by the given user
*UserApi* | [**userListStarred**](docs/UserApi.md#userListStarred) | **GET** /users/{username}/starred | The repos that the given user has starred
*UserApi* | [**userListSubscriptions**](docs/UserApi.md#userListSubscriptions) | **GET** /users/{username}/subscriptions | List the repositories watched by a user
*UserApi* | [**userListTeams**](docs/UserApi.md#userListTeams) | **GET** /user/teams | List all the teams a user belongs to
*UserApi* | [**userSearch**](docs/UserApi.md#userSearch) | **GET** /users/search | Search for users
*UserApi* | [**userUpdateOAuth2Application**](docs/UserApi.md#userUpdateOAuth2Application) | **PATCH** /user/applications/oauth2/{id} | update an OAuth2 Application, this includes regenerating the client secret
*UserApi* | [**userVerifyGPGKey**](docs/UserApi.md#userVerifyGPGKey) | **POST** /user/gpg_key_verify | Verify a GPG key


## Documentation for Models

 - [APIError](docs/APIError.md)
 - [AccessToken](docs/AccessToken.md)
 - [AddCollaboratorOption](docs/AddCollaboratorOption.md)
 - [AddTimeOption](docs/AddTimeOption.md)
 - [AnnotatedTag](docs/AnnotatedTag.md)
 - [AnnotatedTagObject](docs/AnnotatedTagObject.md)
 - [Attachment](docs/Attachment.md)
 - [Branch](docs/Branch.md)
 - [BranchProtection](docs/BranchProtection.md)
 - [CombinedStatus](docs/CombinedStatus.md)
 - [Comment](docs/Comment.md)
 - [Commit](docs/Commit.md)
 - [CommitAffectedFiles](docs/CommitAffectedFiles.md)
 - [CommitDateOptions](docs/CommitDateOptions.md)
 - [CommitMeta](docs/CommitMeta.md)
 - [CommitStatus](docs/CommitStatus.md)
 - [CommitStatusState](docs/CommitStatusState.md)
 - [CommitUser](docs/CommitUser.md)
 - [ContentsResponse](docs/ContentsResponse.md)
 - [CreateAccessTokenOption](docs/CreateAccessTokenOption.md)
 - [CreateBranchProtectionOption](docs/CreateBranchProtectionOption.md)
 - [CreateBranchRepoOption](docs/CreateBranchRepoOption.md)
 - [CreateEmailOption](docs/CreateEmailOption.md)
 - [CreateFileOptions](docs/CreateFileOptions.md)
 - [CreateForkOption](docs/CreateForkOption.md)
 - [CreateGPGKeyOption](docs/CreateGPGKeyOption.md)
 - [CreateHookOption](docs/CreateHookOption.md)
 - [CreateHookOptionConfig](docs/CreateHookOptionConfig.md)
 - [CreateIssueCommentOption](docs/CreateIssueCommentOption.md)
 - [CreateIssueOption](docs/CreateIssueOption.md)
 - [CreateKeyOption](docs/CreateKeyOption.md)
 - [CreateLabelOption](docs/CreateLabelOption.md)
 - [CreateMilestoneOption](docs/CreateMilestoneOption.md)
 - [CreateOAuth2ApplicationOptions](docs/CreateOAuth2ApplicationOptions.md)
 - [CreateOrgOption](docs/CreateOrgOption.md)
 - [CreatePullRequestOption](docs/CreatePullRequestOption.md)
 - [CreatePullReviewComment](docs/CreatePullReviewComment.md)
 - [CreatePullReviewOptions](docs/CreatePullReviewOptions.md)
 - [CreateReleaseOption](docs/CreateReleaseOption.md)
 - [CreateRepoOption](docs/CreateRepoOption.md)
 - [CreateStatusOption](docs/CreateStatusOption.md)
 - [CreateTagOption](docs/CreateTagOption.md)
 - [CreateTeamOption](docs/CreateTeamOption.md)
 - [CreateUserOption](docs/CreateUserOption.md)
 - [CreateWikiPageOptions](docs/CreateWikiPageOptions.md)
 - [Cron](docs/Cron.md)
 - [DeleteEmailOption](docs/DeleteEmailOption.md)
 - [DeleteFileOptions](docs/DeleteFileOptions.md)
 - [DeployKey](docs/DeployKey.md)
 - [DismissPullReviewOptions](docs/DismissPullReviewOptions.md)
 - [EditAttachmentOptions](docs/EditAttachmentOptions.md)
 - [EditBranchProtectionOption](docs/EditBranchProtectionOption.md)
 - [EditDeadlineOption](docs/EditDeadlineOption.md)
 - [EditGitHookOption](docs/EditGitHookOption.md)
 - [EditHookOption](docs/EditHookOption.md)
 - [EditIssueCommentOption](docs/EditIssueCommentOption.md)
 - [EditIssueOption](docs/EditIssueOption.md)
 - [EditLabelOption](docs/EditLabelOption.md)
 - [EditMilestoneOption](docs/EditMilestoneOption.md)
 - [EditOrgOption](docs/EditOrgOption.md)
 - [EditPullRequestOption](docs/EditPullRequestOption.md)
 - [EditReactionOption](docs/EditReactionOption.md)
 - [EditReleaseOption](docs/EditReleaseOption.md)
 - [EditRepoOption](docs/EditRepoOption.md)
 - [EditTeamOption](docs/EditTeamOption.md)
 - [EditUserOption](docs/EditUserOption.md)
 - [Email](docs/Email.md)
 - [ExternalTracker](docs/ExternalTracker.md)
 - [ExternalWiki](docs/ExternalWiki.md)
 - [FileCommitResponse](docs/FileCommitResponse.md)
 - [FileDeleteResponse](docs/FileDeleteResponse.md)
 - [FileLinksResponse](docs/FileLinksResponse.md)
 - [FileResponse](docs/FileResponse.md)
 - [GPGKey](docs/GPGKey.md)
 - [GPGKeyEmail](docs/GPGKeyEmail.md)
 - [GeneralAPISettings](docs/GeneralAPISettings.md)
 - [GeneralAttachmentSettings](docs/GeneralAttachmentSettings.md)
 - [GeneralRepoSettings](docs/GeneralRepoSettings.md)
 - [GeneralUISettings](docs/GeneralUISettings.md)
 - [GenerateRepoOption](docs/GenerateRepoOption.md)
 - [GitBlobResponse](docs/GitBlobResponse.md)
 - [GitEntry](docs/GitEntry.md)
 - [GitHook](docs/GitHook.md)
 - [GitObject](docs/GitObject.md)
 - [GitServiceType](docs/GitServiceType.md)
 - [GitTreeResponse](docs/GitTreeResponse.md)
 - [Hook](docs/Hook.md)
 - [Identity](docs/Identity.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InternalTracker](docs/InternalTracker.md)
 - [Issue](docs/Issue.md)
 - [IssueDeadline](docs/IssueDeadline.md)
 - [IssueLabelsOption](docs/IssueLabelsOption.md)
 - [IssueTemplate](docs/IssueTemplate.md)
 - [Label](docs/Label.md)
 - [MarkdownOption](docs/MarkdownOption.md)
 - [MergePullRequestOption](docs/MergePullRequestOption.md)
 - [MigrateRepoForm](docs/MigrateRepoForm.md)
 - [MigrateRepoOptions](docs/MigrateRepoOptions.md)
 - [Milestone](docs/Milestone.md)
 - [NodeInfo](docs/NodeInfo.md)
 - [NodeInfoServices](docs/NodeInfoServices.md)
 - [NodeInfoSoftware](docs/NodeInfoSoftware.md)
 - [NodeInfoUsage](docs/NodeInfoUsage.md)
 - [NodeInfoUsageUsers](docs/NodeInfoUsageUsers.md)
 - [Note](docs/Note.md)
 - [NotificationCount](docs/NotificationCount.md)
 - [NotificationSubject](docs/NotificationSubject.md)
 - [NotificationThread](docs/NotificationThread.md)
 - [NotifySubjectType](docs/NotifySubjectType.md)
 - [OAuth2Application](docs/OAuth2Application.md)
 - [Organization](docs/Organization.md)
 - [OrganizationPermissions](docs/OrganizationPermissions.md)
 - [PRBranchInfo](docs/PRBranchInfo.md)
 - [PayloadCommit](docs/PayloadCommit.md)
 - [PayloadCommitVerification](docs/PayloadCommitVerification.md)
 - [PayloadUser](docs/PayloadUser.md)
 - [Permission](docs/Permission.md)
 - [PublicKey](docs/PublicKey.md)
 - [PullRequest](docs/PullRequest.md)
 - [PullRequestMeta](docs/PullRequestMeta.md)
 - [PullReview](docs/PullReview.md)
 - [PullReviewComment](docs/PullReviewComment.md)
 - [PullReviewRequestOptions](docs/PullReviewRequestOptions.md)
 - [Reaction](docs/Reaction.md)
 - [Reference](docs/Reference.md)
 - [Release](docs/Release.md)
 - [RepoCommit](docs/RepoCommit.md)
 - [RepoTopicOptions](docs/RepoTopicOptions.md)
 - [RepoTransfer](docs/RepoTransfer.md)
 - [Repository](docs/Repository.md)
 - [RepositoryMeta](docs/RepositoryMeta.md)
 - [ReviewStateType](docs/ReviewStateType.md)
 - [SearchResults](docs/SearchResults.md)
 - [ServerVersion](docs/ServerVersion.md)
 - [StateType](docs/StateType.md)
 - [StopWatch](docs/StopWatch.md)
 - [SubmitPullReviewOptions](docs/SubmitPullReviewOptions.md)
 - [Tag](docs/Tag.md)
 - [Team](docs/Team.md)
 - [TimeStamp](docs/TimeStamp.md)
 - [TimelineComment](docs/TimelineComment.md)
 - [TopicName](docs/TopicName.md)
 - [TopicResponse](docs/TopicResponse.md)
 - [TrackedTime](docs/TrackedTime.md)
 - [TransferRepoOption](docs/TransferRepoOption.md)
 - [UpdateFileOptions](docs/UpdateFileOptions.md)
 - [User](docs/User.md)
 - [UserHeatmapData](docs/UserHeatmapData.md)
 - [UserSettings](docs/UserSettings.md)
 - [UserSettingsOptions](docs/UserSettingsOptions.md)
 - [WatchInfo](docs/WatchInfo.md)
 - [WikiCommit](docs/WikiCommit.md)
 - [WikiCommitList](docs/WikiCommitList.md)
 - [WikiPage](docs/WikiPage.md)
 - [WikiPageMetaData](docs/WikiPageMetaData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### TOTPHeader

- **Type**: API key
- **API key parameter name**: X-GITEA-OTP
- **Location**: HTTP header

### AuthorizationHeaderToken

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### SudoHeader

- **Type**: API key
- **API key parameter name**: Sudo
- **Location**: HTTP header

### BasicAuth

- **Type**: HTTP basic authentication

### AccessToken

- **Type**: API key
- **API key parameter name**: access_token
- **Location**: URL query string

### SudoParam

- **Type**: API key
- **API key parameter name**: sudo
- **Location**: URL query string

### Token

- **Type**: API key
- **API key parameter name**: token
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



