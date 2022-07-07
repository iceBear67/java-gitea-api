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
 * CommitDateOptions store dates for GIT_AUTHOR_DATE and GIT_COMMITTER_DATE
 */
@ApiModel(description = "CommitDateOptions store dates for GIT_AUTHOR_DATE and GIT_COMMITTER_DATE")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class CommitDateOptions   {
  @SerializedName("author")
  private DateTime author = null;

  @SerializedName("committer")
  private DateTime committer = null;

  public CommitDateOptions author(DateTime author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getAuthor() {
    return author;
  }

  public void setAuthor(DateTime author) {
    this.author = author;
  }

  public CommitDateOptions committer(DateTime committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCommitter() {
    return committer;
  }

  public void setCommitter(DateTime committer) {
    this.committer = committer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitDateOptions commitDateOptions = (CommitDateOptions) o;
    return Objects.equals(this.author, commitDateOptions.author) &&
        Objects.equals(this.committer, commitDateOptions.committer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, committer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitDateOptions {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
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

