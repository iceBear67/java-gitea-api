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
import com.gitea.model.Commit;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Note contains information related to a git note
 */
@ApiModel(description = "Note contains information related to a git note")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class Note   {
  @SerializedName("commit")
  private Commit commit = null;

  @SerializedName("message")
  private String message = null;

  public Note commit(Commit commit) {
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Commit getCommit() {
    return commit;
  }

  public void setCommit(Commit commit) {
    this.commit = commit;
  }

  public Note message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.commit, note.commit) &&
        Objects.equals(this.message, note.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commit, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

