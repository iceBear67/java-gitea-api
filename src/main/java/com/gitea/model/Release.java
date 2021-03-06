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
import com.gitea.model.Attachment;
import com.gitea.model.User;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * Release represents a repository release
 */
@ApiModel(description = "Release represents a repository release")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class Release   {
  @SerializedName("assets")
  private List<Attachment> assets = new ArrayList<Attachment>();

  @SerializedName("author")
  private User author = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("draft")
  private Boolean draft = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("prerelease")
  private Boolean prerelease = null;

  @SerializedName("published_at")
  private DateTime publishedAt = null;

  @SerializedName("tag_name")
  private String tagName = null;

  @SerializedName("tarball_url")
  private String tarballUrl = null;

  @SerializedName("target_commitish")
  private String targetCommitish = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("zipball_url")
  private String zipballUrl = null;

  public Release assets(List<Attachment> assets) {
    this.assets = assets;
    return this;
  }

  public Release addAssetsItem(Attachment assetsItem) {
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Attachment> getAssets() {
    return assets;
  }

  public void setAssets(List<Attachment> assets) {
    this.assets = assets;
  }

  public Release author(User author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public Release body(String body) {
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

  public Release createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Release draft(Boolean draft) {
    this.draft = draft;
    return this;
  }

   /**
   * Get draft
   * @return draft
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDraft() {
    return draft;
  }

  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  public Release htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public Release id(Long id) {
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

  public Release name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Release prerelease(Boolean prerelease) {
    this.prerelease = prerelease;
    return this;
  }

   /**
   * Get prerelease
   * @return prerelease
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPrerelease() {
    return prerelease;
  }

  public void setPrerelease(Boolean prerelease) {
    this.prerelease = prerelease;
  }

  public Release publishedAt(DateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * Get publishedAt
   * @return publishedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(DateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public Release tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public Release tarballUrl(String tarballUrl) {
    this.tarballUrl = tarballUrl;
    return this;
  }

   /**
   * Get tarballUrl
   * @return tarballUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTarballUrl() {
    return tarballUrl;
  }

  public void setTarballUrl(String tarballUrl) {
    this.tarballUrl = tarballUrl;
  }

  public Release targetCommitish(String targetCommitish) {
    this.targetCommitish = targetCommitish;
    return this;
  }

   /**
   * Get targetCommitish
   * @return targetCommitish
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTargetCommitish() {
    return targetCommitish;
  }

  public void setTargetCommitish(String targetCommitish) {
    this.targetCommitish = targetCommitish;
  }

  public Release url(String url) {
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

  public Release zipballUrl(String zipballUrl) {
    this.zipballUrl = zipballUrl;
    return this;
  }

   /**
   * Get zipballUrl
   * @return zipballUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getZipballUrl() {
    return zipballUrl;
  }

  public void setZipballUrl(String zipballUrl) {
    this.zipballUrl = zipballUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Release release = (Release) o;
    return Objects.equals(this.assets, release.assets) &&
        Objects.equals(this.author, release.author) &&
        Objects.equals(this.body, release.body) &&
        Objects.equals(this.createdAt, release.createdAt) &&
        Objects.equals(this.draft, release.draft) &&
        Objects.equals(this.htmlUrl, release.htmlUrl) &&
        Objects.equals(this.id, release.id) &&
        Objects.equals(this.name, release.name) &&
        Objects.equals(this.prerelease, release.prerelease) &&
        Objects.equals(this.publishedAt, release.publishedAt) &&
        Objects.equals(this.tagName, release.tagName) &&
        Objects.equals(this.tarballUrl, release.tarballUrl) &&
        Objects.equals(this.targetCommitish, release.targetCommitish) &&
        Objects.equals(this.url, release.url) &&
        Objects.equals(this.zipballUrl, release.zipballUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, author, body, createdAt, draft, htmlUrl, id, name, prerelease, publishedAt, tagName, tarballUrl, targetCommitish, url, zipballUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Release {\n");
    
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    tarballUrl: ").append(toIndentedString(tarballUrl)).append("\n");
    sb.append("    targetCommitish: ").append(toIndentedString(targetCommitish)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    zipballUrl: ").append(toIndentedString(zipballUrl)).append("\n");
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

