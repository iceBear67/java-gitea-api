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


/**
 * EditOrgOption options for editing an organization
 */
@ApiModel(description = "EditOrgOption options for editing an organization")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class EditOrgOption   {
  @SerializedName("description")
  private String description = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("repo_admin_change_team_access")
  private Boolean repoAdminChangeTeamAccess = null;

  /**
   * possible values are `public`, `limited` or `private`
   */
  public enum VisibilityEnum {
    @SerializedName("public")
    PUBLIC("public"),
    
    @SerializedName("limited")
    LIMITED("limited"),
    
    @SerializedName("private")
    PRIVATE("private");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("visibility")
  private VisibilityEnum visibility = null;

  @SerializedName("website")
  private String website = null;

  public EditOrgOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EditOrgOption fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public EditOrgOption location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public EditOrgOption repoAdminChangeTeamAccess(Boolean repoAdminChangeTeamAccess) {
    this.repoAdminChangeTeamAccess = repoAdminChangeTeamAccess;
    return this;
  }

   /**
   * Get repoAdminChangeTeamAccess
   * @return repoAdminChangeTeamAccess
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRepoAdminChangeTeamAccess() {
    return repoAdminChangeTeamAccess;
  }

  public void setRepoAdminChangeTeamAccess(Boolean repoAdminChangeTeamAccess) {
    this.repoAdminChangeTeamAccess = repoAdminChangeTeamAccess;
  }

  public EditOrgOption visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * possible values are `public`, `limited` or `private`
   * @return visibility
  **/
  @ApiModelProperty(example = "null", value = "possible values are `public`, `limited` or `private`")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public EditOrgOption website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(example = "null", value = "")
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
    EditOrgOption editOrgOption = (EditOrgOption) o;
    return Objects.equals(this.description, editOrgOption.description) &&
        Objects.equals(this.fullName, editOrgOption.fullName) &&
        Objects.equals(this.location, editOrgOption.location) &&
        Objects.equals(this.repoAdminChangeTeamAccess, editOrgOption.repoAdminChangeTeamAccess) &&
        Objects.equals(this.visibility, editOrgOption.visibility) &&
        Objects.equals(this.website, editOrgOption.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fullName, location, repoAdminChangeTeamAccess, visibility, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditOrgOption {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    repoAdminChangeTeamAccess: ").append(toIndentedString(repoAdminChangeTeamAccess)).append("\n");
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

