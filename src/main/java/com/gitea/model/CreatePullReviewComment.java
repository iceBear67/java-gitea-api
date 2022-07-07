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
 * CreatePullReviewComment represent a review comment for creation api
 */
@ApiModel(description = "CreatePullReviewComment represent a review comment for creation api")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class CreatePullReviewComment   {
  @SerializedName("body")
  private String body = null;

  @SerializedName("new_position")
  private Long newPosition = null;

  @SerializedName("old_position")
  private Long oldPosition = null;

  @SerializedName("path")
  private String path = null;

  public CreatePullReviewComment body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public CreatePullReviewComment newPosition(Long newPosition) {
    this.newPosition = newPosition;
    return this;
  }

   /**
   * if comment to new file line or 0
   * @return newPosition
  **/
  @ApiModelProperty(example = "null", value = "if comment to new file line or 0")
  public Long getNewPosition() {
    return newPosition;
  }

  public void setNewPosition(Long newPosition) {
    this.newPosition = newPosition;
  }

  public CreatePullReviewComment oldPosition(Long oldPosition) {
    this.oldPosition = oldPosition;
    return this;
  }

   /**
   * if comment to old file line or 0
   * @return oldPosition
  **/
  @ApiModelProperty(example = "null", value = "if comment to old file line or 0")
  public Long getOldPosition() {
    return oldPosition;
  }

  public void setOldPosition(Long oldPosition) {
    this.oldPosition = oldPosition;
  }

  public CreatePullReviewComment path(String path) {
    this.path = path;
    return this;
  }

   /**
   * the tree path
   * @return path
  **/
  @ApiModelProperty(example = "null", value = "the tree path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePullReviewComment createPullReviewComment = (CreatePullReviewComment) o;
    return Objects.equals(this.body, createPullReviewComment.body) &&
        Objects.equals(this.newPosition, createPullReviewComment.newPosition) &&
        Objects.equals(this.oldPosition, createPullReviewComment.oldPosition) &&
        Objects.equals(this.path, createPullReviewComment.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, newPosition, oldPosition, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePullReviewComment {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    newPosition: ").append(toIndentedString(newPosition)).append("\n");
    sb.append("    oldPosition: ").append(toIndentedString(oldPosition)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

