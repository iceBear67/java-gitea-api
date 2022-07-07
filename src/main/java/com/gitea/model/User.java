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


package com.gitea.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * User represents a user
 */
@ApiModel(description = "User represents a user")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class User   {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("avatar_url")
  private String avatarUrl = null;

  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("followers_count")
  private Long followersCount = null;

  @SerializedName("following_count")
  private Long followingCount = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("is_admin")
  private Boolean isAdmin = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("last_login")
  private DateTime lastLogin = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("login")
  private String login = null;

  @SerializedName("prohibit_login")
  private Boolean prohibitLogin = null;

  @SerializedName("restricted")
  private Boolean restricted = null;

  @SerializedName("starred_repos_count")
  private Long starredReposCount = null;

  @SerializedName("visibility")
  private String visibility = null;

  @SerializedName("website")
  private String website = null;

  public User active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Is user active
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "Is user active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public User avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * URL to the user's avatar
   * @return avatarUrl
  **/
  @ApiModelProperty(example = "null", value = "URL to the user's avatar")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public User created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public User description(String description) {
    this.description = description;
    return this;
  }

   /**
   * the user's description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "the user's description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User followersCount(Long followersCount) {
    this.followersCount = followersCount;
    return this;
  }

   /**
   * user counts
   * @return followersCount
  **/
  @ApiModelProperty(example = "null", value = "user counts")
  public Long getFollowersCount() {
    return followersCount;
  }

  public void setFollowersCount(Long followersCount) {
    this.followersCount = followersCount;
  }

  public User followingCount(Long followingCount) {
    this.followingCount = followingCount;
    return this;
  }

   /**
   * Get followingCount
   * @return followingCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getFollowingCount() {
    return followingCount;
  }

  public void setFollowingCount(Long followingCount) {
    this.followingCount = followingCount;
  }

  public User fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * the user's full name
   * @return fullName
  **/
  @ApiModelProperty(example = "null", value = "the user's full name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public User id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * the user's id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "the user's id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Is the user an administrator
   * @return isAdmin
  **/
  @ApiModelProperty(example = "null", value = "Is the user an administrator")
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public User language(String language) {
    this.language = language;
    return this;
  }

   /**
   * User locale
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "User locale")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public User lastLogin(DateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(DateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public User location(String location) {
    this.location = location;
    return this;
  }

   /**
   * the user's location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "the user's location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public User login(String login) {
    this.login = login;
    return this;
  }

   /**
   * the user's username
   * @return login
  **/
  @ApiModelProperty(example = "null", value = "the user's username")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public User prohibitLogin(Boolean prohibitLogin) {
    this.prohibitLogin = prohibitLogin;
    return this;
  }

   /**
   * Is user login prohibited
   * @return prohibitLogin
  **/
  @ApiModelProperty(example = "null", value = "Is user login prohibited")
  public Boolean getProhibitLogin() {
    return prohibitLogin;
  }

  public void setProhibitLogin(Boolean prohibitLogin) {
    this.prohibitLogin = prohibitLogin;
  }

  public User restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

   /**
   * Is user restricted
   * @return restricted
  **/
  @ApiModelProperty(example = "null", value = "Is user restricted")
  public Boolean getRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  public User starredReposCount(Long starredReposCount) {
    this.starredReposCount = starredReposCount;
    return this;
  }

   /**
   * Get starredReposCount
   * @return starredReposCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getStarredReposCount() {
    return starredReposCount;
  }

  public void setStarredReposCount(Long starredReposCount) {
    this.starredReposCount = starredReposCount;
  }

  public User visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * User visibility level option: public, limited, private
   * @return visibility
  **/
  @ApiModelProperty(example = "null", value = "User visibility level option: public, limited, private")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public User website(String website) {
    this.website = website;
    return this;
  }

   /**
   * the user's website
   * @return website
  **/
  @ApiModelProperty(example = "null", value = "the user's website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.active, user.active) &&
        Objects.equals(this.avatarUrl, user.avatarUrl) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.description, user.description) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.followersCount, user.followersCount) &&
        Objects.equals(this.followingCount, user.followingCount) &&
        Objects.equals(this.fullName, user.fullName) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.isAdmin, user.isAdmin) &&
        Objects.equals(this.language, user.language) &&
        Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.location, user.location) &&
        Objects.equals(this.login, user.login) &&
        Objects.equals(this.prohibitLogin, user.prohibitLogin) &&
        Objects.equals(this.restricted, user.restricted) &&
        Objects.equals(this.starredReposCount, user.starredReposCount) &&
        Objects.equals(this.visibility, user.visibility) &&
        Objects.equals(this.website, user.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, avatarUrl, created, description, email, followersCount, followingCount, fullName, id, isAdmin, language, lastLogin, location, login, prohibitLogin, restricted, starredReposCount, visibility, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    prohibitLogin: ").append(toIndentedString(prohibitLogin)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    starredReposCount: ").append(toIndentedString(starredReposCount)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
