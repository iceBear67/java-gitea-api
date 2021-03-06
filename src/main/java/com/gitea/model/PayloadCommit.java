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
import com.gitea.model.PayloadCommitVerification;
import com.gitea.model.PayloadUser;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * PayloadCommit represents a commit
 */
@ApiModel(description = "PayloadCommit represents a commit")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class PayloadCommit   {
  @SerializedName("added")
  private List<String> added = new ArrayList<String>();

  @SerializedName("author")
  private PayloadUser author = null;

  @SerializedName("committer")
  private PayloadUser committer = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("modified")
  private List<String> modified = new ArrayList<String>();

  @SerializedName("removed")
  private List<String> removed = new ArrayList<String>();

  @SerializedName("timestamp")
  private DateTime timestamp = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("verification")
  private PayloadCommitVerification verification = null;

  public PayloadCommit added(List<String> added) {
    this.added = added;
    return this;
  }

  public PayloadCommit addAddedItem(String addedItem) {
    this.added.add(addedItem);
    return this;
  }

   /**
   * Get added
   * @return added
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAdded() {
    return added;
  }

  public void setAdded(List<String> added) {
    this.added = added;
  }

  public PayloadCommit author(PayloadUser author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(example = "null", value = "")
  public PayloadUser getAuthor() {
    return author;
  }

  public void setAuthor(PayloadUser author) {
    this.author = author;
  }

  public PayloadCommit committer(PayloadUser committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @ApiModelProperty(example = "null", value = "")
  public PayloadUser getCommitter() {
    return committer;
  }

  public void setCommitter(PayloadUser committer) {
    this.committer = committer;
  }

  public PayloadCommit id(String id) {
    this.id = id;
    return this;
  }

   /**
   * sha1 hash of the commit
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "sha1 hash of the commit")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PayloadCommit message(String message) {
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

  public PayloadCommit modified(List<String> modified) {
    this.modified = modified;
    return this;
  }

  public PayloadCommit addModifiedItem(String modifiedItem) {
    this.modified.add(modifiedItem);
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getModified() {
    return modified;
  }

  public void setModified(List<String> modified) {
    this.modified = modified;
  }

  public PayloadCommit removed(List<String> removed) {
    this.removed = removed;
    return this;
  }

  public PayloadCommit addRemovedItem(String removedItem) {
    this.removed.add(removedItem);
    return this;
  }

   /**
   * Get removed
   * @return removed
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getRemoved() {
    return removed;
  }

  public void setRemoved(List<String> removed) {
    this.removed = removed;
  }

  public PayloadCommit timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public PayloadCommit url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PayloadCommit verification(PayloadCommitVerification verification) {
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @ApiModelProperty(example = "null", value = "")
  public PayloadCommitVerification getVerification() {
    return verification;
  }

  public void setVerification(PayloadCommitVerification verification) {
    this.verification = verification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadCommit payloadCommit = (PayloadCommit) o;
    return Objects.equals(this.added, payloadCommit.added) &&
        Objects.equals(this.author, payloadCommit.author) &&
        Objects.equals(this.committer, payloadCommit.committer) &&
        Objects.equals(this.id, payloadCommit.id) &&
        Objects.equals(this.message, payloadCommit.message) &&
        Objects.equals(this.modified, payloadCommit.modified) &&
        Objects.equals(this.removed, payloadCommit.removed) &&
        Objects.equals(this.timestamp, payloadCommit.timestamp) &&
        Objects.equals(this.url, payloadCommit.url) &&
        Objects.equals(this.verification, payloadCommit.verification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(added, author, committer, id, message, modified, removed, timestamp, url, verification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadCommit {\n");
    
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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

