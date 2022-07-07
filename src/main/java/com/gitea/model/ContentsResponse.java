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
import com.gitea.model.FileLinksResponse;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ContentsResponse contains information about a repo&#39;s entry&#39;s (dir, file, symlink, submodule) metadata and content
 */
@ApiModel(description = "ContentsResponse contains information about a repo's entry's (dir, file, symlink, submodule) metadata and content")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class ContentsResponse   {
  @SerializedName("_links")
  private FileLinksResponse links = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("download_url")
  private String downloadUrl = null;

  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("git_url")
  private String gitUrl = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("sha")
  private String sha = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("submodule_git_url")
  private String submoduleGitUrl = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("url")
  private String url = null;

  public ContentsResponse links(FileLinksResponse links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public FileLinksResponse getLinks() {
    return links;
  }

  public void setLinks(FileLinksResponse links) {
    this.links = links;
  }

  public ContentsResponse content(String content) {
    this.content = content;
    return this;
  }

   /**
   * `content` is populated when `type` is `file`, otherwise null
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "`content` is populated when `type` is `file`, otherwise null")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ContentsResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public ContentsResponse encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * `encoding` is populated when `type` is `file`, otherwise null
   * @return encoding
  **/
  @ApiModelProperty(example = "null", value = "`encoding` is populated when `type` is `file`, otherwise null")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public ContentsResponse gitUrl(String gitUrl) {
    this.gitUrl = gitUrl;
    return this;
  }

   /**
   * Get gitUrl
   * @return gitUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGitUrl() {
    return gitUrl;
  }

  public void setGitUrl(String gitUrl) {
    this.gitUrl = gitUrl;
  }

  public ContentsResponse htmlUrl(String htmlUrl) {
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

  public ContentsResponse name(String name) {
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

  public ContentsResponse path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ContentsResponse sha(String sha) {
    this.sha = sha;
    return this;
  }

   /**
   * Get sha
   * @return sha
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public ContentsResponse size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public ContentsResponse submoduleGitUrl(String submoduleGitUrl) {
    this.submoduleGitUrl = submoduleGitUrl;
    return this;
  }

   /**
   * `submodule_git_url` is populated when `type` is `submodule`, otherwise null
   * @return submoduleGitUrl
  **/
  @ApiModelProperty(example = "null", value = "`submodule_git_url` is populated when `type` is `submodule`, otherwise null")
  public String getSubmoduleGitUrl() {
    return submoduleGitUrl;
  }

  public void setSubmoduleGitUrl(String submoduleGitUrl) {
    this.submoduleGitUrl = submoduleGitUrl;
  }

  public ContentsResponse target(String target) {
    this.target = target;
    return this;
  }

   /**
   * `target` is populated when `type` is `symlink`, otherwise null
   * @return target
  **/
  @ApiModelProperty(example = "null", value = "`target` is populated when `type` is `symlink`, otherwise null")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public ContentsResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * `type` will be `file`, `dir`, `symlink`, or `submodule`
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "`type` will be `file`, `dir`, `symlink`, or `submodule`")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ContentsResponse url(String url) {
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
    ContentsResponse contentsResponse = (ContentsResponse) o;
    return Objects.equals(this.links, contentsResponse.links) &&
        Objects.equals(this.content, contentsResponse.content) &&
        Objects.equals(this.downloadUrl, contentsResponse.downloadUrl) &&
        Objects.equals(this.encoding, contentsResponse.encoding) &&
        Objects.equals(this.gitUrl, contentsResponse.gitUrl) &&
        Objects.equals(this.htmlUrl, contentsResponse.htmlUrl) &&
        Objects.equals(this.name, contentsResponse.name) &&
        Objects.equals(this.path, contentsResponse.path) &&
        Objects.equals(this.sha, contentsResponse.sha) &&
        Objects.equals(this.size, contentsResponse.size) &&
        Objects.equals(this.submoduleGitUrl, contentsResponse.submoduleGitUrl) &&
        Objects.equals(this.target, contentsResponse.target) &&
        Objects.equals(this.type, contentsResponse.type) &&
        Objects.equals(this.url, contentsResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, content, downloadUrl, encoding, gitUrl, htmlUrl, name, path, sha, size, submoduleGitUrl, target, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsResponse {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    submoduleGitUrl: ").append(toIndentedString(submoduleGitUrl)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

