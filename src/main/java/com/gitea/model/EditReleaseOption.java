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
 * EditReleaseOption options when editing a release
 */
@ApiModel(description = "EditReleaseOption options when editing a release")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class EditReleaseOption   {
  @SerializedName("body")
  private String body = null;

  @SerializedName("draft")
  private Boolean draft = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("prerelease")
  private Boolean prerelease = null;

  @SerializedName("tag_name")
  private String tagName = null;

  @SerializedName("target_commitish")
  private String targetCommitish = null;

  public EditReleaseOption body(String body) {
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

  public EditReleaseOption draft(Boolean draft) {
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

  public EditReleaseOption name(String name) {
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

  public EditReleaseOption prerelease(Boolean prerelease) {
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

  public EditReleaseOption tagName(String tagName) {
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

  public EditReleaseOption targetCommitish(String targetCommitish) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditReleaseOption editReleaseOption = (EditReleaseOption) o;
    return Objects.equals(this.body, editReleaseOption.body) &&
        Objects.equals(this.draft, editReleaseOption.draft) &&
        Objects.equals(this.name, editReleaseOption.name) &&
        Objects.equals(this.prerelease, editReleaseOption.prerelease) &&
        Objects.equals(this.tagName, editReleaseOption.tagName) &&
        Objects.equals(this.targetCommitish, editReleaseOption.targetCommitish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, draft, name, prerelease, tagName, targetCommitish);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditReleaseOption {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    targetCommitish: ").append(toIndentedString(targetCommitish)).append("\n");
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
