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
import java.util.ArrayList;
import java.util.List;


/**
 * PullReviewRequestOptions are options to add or remove pull review requests
 */
@ApiModel(description = "PullReviewRequestOptions are options to add or remove pull review requests")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class PullReviewRequestOptions   {
  @SerializedName("reviewers")
  private List<String> reviewers = new ArrayList<String>();

  @SerializedName("team_reviewers")
  private List<String> teamReviewers = new ArrayList<String>();

  public PullReviewRequestOptions reviewers(List<String> reviewers) {
    this.reviewers = reviewers;
    return this;
  }

  public PullReviewRequestOptions addReviewersItem(String reviewersItem) {
    this.reviewers.add(reviewersItem);
    return this;
  }

   /**
   * Get reviewers
   * @return reviewers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getReviewers() {
    return reviewers;
  }

  public void setReviewers(List<String> reviewers) {
    this.reviewers = reviewers;
  }

  public PullReviewRequestOptions teamReviewers(List<String> teamReviewers) {
    this.teamReviewers = teamReviewers;
    return this;
  }

  public PullReviewRequestOptions addTeamReviewersItem(String teamReviewersItem) {
    this.teamReviewers.add(teamReviewersItem);
    return this;
  }

   /**
   * Get teamReviewers
   * @return teamReviewers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getTeamReviewers() {
    return teamReviewers;
  }

  public void setTeamReviewers(List<String> teamReviewers) {
    this.teamReviewers = teamReviewers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullReviewRequestOptions pullReviewRequestOptions = (PullReviewRequestOptions) o;
    return Objects.equals(this.reviewers, pullReviewRequestOptions.reviewers) &&
        Objects.equals(this.teamReviewers, pullReviewRequestOptions.teamReviewers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewers, teamReviewers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullReviewRequestOptions {\n");
    
    sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
    sb.append("    teamReviewers: ").append(toIndentedString(teamReviewers)).append("\n");
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

