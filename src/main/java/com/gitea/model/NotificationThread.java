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
import com.gitea.model.NotificationSubject;
import com.gitea.model.Repository;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * NotificationThread expose Notification on API
 */
@ApiModel(description = "NotificationThread expose Notification on API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class NotificationThread   {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("pinned")
  private Boolean pinned = null;

  @SerializedName("repository")
  private Repository repository = null;

  @SerializedName("subject")
  private NotificationSubject subject = null;

  @SerializedName("unread")
  private Boolean unread = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("url")
  private String url = null;

  public NotificationThread id(Long id) {
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

  public NotificationThread pinned(Boolean pinned) {
    this.pinned = pinned;
    return this;
  }

   /**
   * Get pinned
   * @return pinned
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPinned() {
    return pinned;
  }

  public void setPinned(Boolean pinned) {
    this.pinned = pinned;
  }

  public NotificationThread repository(Repository repository) {
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @ApiModelProperty(example = "null", value = "")
  public Repository getRepository() {
    return repository;
  }

  public void setRepository(Repository repository) {
    this.repository = repository;
  }

  public NotificationThread subject(NotificationSubject subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "")
  public NotificationSubject getSubject() {
    return subject;
  }

  public void setSubject(NotificationSubject subject) {
    this.subject = subject;
  }

  public NotificationThread unread(Boolean unread) {
    this.unread = unread;
    return this;
  }

   /**
   * Get unread
   * @return unread
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getUnread() {
    return unread;
  }

  public void setUnread(Boolean unread) {
    this.unread = unread;
  }

  public NotificationThread updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public NotificationThread url(String url) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationThread notificationThread = (NotificationThread) o;
    return Objects.equals(this.id, notificationThread.id) &&
        Objects.equals(this.pinned, notificationThread.pinned) &&
        Objects.equals(this.repository, notificationThread.repository) &&
        Objects.equals(this.subject, notificationThread.subject) &&
        Objects.equals(this.unread, notificationThread.unread) &&
        Objects.equals(this.updatedAt, notificationThread.updatedAt) &&
        Objects.equals(this.url, notificationThread.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pinned, repository, subject, unread, updatedAt, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationThread {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

