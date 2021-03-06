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
 * TopicResponse for returning topics
 */
@ApiModel(description = "TopicResponse for returning topics")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class TopicResponse   {
  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("repo_count")
  private Long repoCount = null;

  @SerializedName("topic_name")
  private String topicName = null;

  @SerializedName("updated")
  private DateTime updated = null;

  public TopicResponse created(DateTime created) {
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

  public TopicResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TopicResponse repoCount(Long repoCount) {
    this.repoCount = repoCount;
    return this;
  }

   /**
   * Get repoCount
   * @return repoCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getRepoCount() {
    return repoCount;
  }

  public void setRepoCount(Long repoCount) {
    this.repoCount = repoCount;
  }

  public TopicResponse topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public TopicResponse updated(DateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getUpdated() {
    return updated;
  }

  public void setUpdated(DateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicResponse topicResponse = (TopicResponse) o;
    return Objects.equals(this.created, topicResponse.created) &&
        Objects.equals(this.id, topicResponse.id) &&
        Objects.equals(this.repoCount, topicResponse.repoCount) &&
        Objects.equals(this.topicName, topicResponse.topicName) &&
        Objects.equals(this.updated, topicResponse.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, id, repoCount, topicName, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicResponse {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repoCount: ").append(toIndentedString(repoCount)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

