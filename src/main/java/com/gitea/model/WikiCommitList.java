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
import com.gitea.model.WikiCommit;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * WikiCommitList commit/revision list
 */
@ApiModel(description = "WikiCommitList commit/revision list")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class WikiCommitList   {
  @SerializedName("commits")
  private List<WikiCommit> commits = new ArrayList<WikiCommit>();

  @SerializedName("count")
  private Long count = null;

  public WikiCommitList commits(List<WikiCommit> commits) {
    this.commits = commits;
    return this;
  }

  public WikiCommitList addCommitsItem(WikiCommit commitsItem) {
    this.commits.add(commitsItem);
    return this;
  }

   /**
   * Get commits
   * @return commits
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<WikiCommit> getCommits() {
    return commits;
  }

  public void setCommits(List<WikiCommit> commits) {
    this.commits = commits;
  }

  public WikiCommitList count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiCommitList wikiCommitList = (WikiCommitList) o;
    return Objects.equals(this.commits, wikiCommitList.commits) &&
        Objects.equals(this.count, wikiCommitList.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commits, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiCommitList {\n");
    
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
