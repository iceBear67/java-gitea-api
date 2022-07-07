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
 * GeneralRepoSettings contains global repository settings exposed by API
 */
@ApiModel(description = "GeneralRepoSettings contains global repository settings exposed by API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class GeneralRepoSettings   {
  @SerializedName("http_git_disabled")
  private Boolean httpGitDisabled = null;

  @SerializedName("lfs_disabled")
  private Boolean lfsDisabled = null;

  @SerializedName("migrations_disabled")
  private Boolean migrationsDisabled = null;

  @SerializedName("mirrors_disabled")
  private Boolean mirrorsDisabled = null;

  @SerializedName("stars_disabled")
  private Boolean starsDisabled = null;

  @SerializedName("time_tracking_disabled")
  private Boolean timeTrackingDisabled = null;

  public GeneralRepoSettings httpGitDisabled(Boolean httpGitDisabled) {
    this.httpGitDisabled = httpGitDisabled;
    return this;
  }

   /**
   * Get httpGitDisabled
   * @return httpGitDisabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHttpGitDisabled() {
    return httpGitDisabled;
  }

  public void setHttpGitDisabled(Boolean httpGitDisabled) {
    this.httpGitDisabled = httpGitDisabled;
  }

  public GeneralRepoSettings lfsDisabled(Boolean lfsDisabled) {
    this.lfsDisabled = lfsDisabled;
    return this;
  }

   /**
   * Get lfsDisabled
   * @return lfsDisabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getLfsDisabled() {
    return lfsDisabled;
  }

  public void setLfsDisabled(Boolean lfsDisabled) {
    this.lfsDisabled = lfsDisabled;
  }

  public GeneralRepoSettings migrationsDisabled(Boolean migrationsDisabled) {
    this.migrationsDisabled = migrationsDisabled;
    return this;
  }

   /**
   * Get migrationsDisabled
   * @return migrationsDisabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMigrationsDisabled() {
    return migrationsDisabled;
  }

  public void setMigrationsDisabled(Boolean migrationsDisabled) {
    this.migrationsDisabled = migrationsDisabled;
  }

  public GeneralRepoSettings mirrorsDisabled(Boolean mirrorsDisabled) {
    this.mirrorsDisabled = mirrorsDisabled;
    return this;
  }

   /**
   * Get mirrorsDisabled
   * @return mirrorsDisabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMirrorsDisabled() {
    return mirrorsDisabled;
  }

  public void setMirrorsDisabled(Boolean mirrorsDisabled) {
    this.mirrorsDisabled = mirrorsDisabled;
  }

  public GeneralRepoSettings starsDisabled(Boolean starsDisabled) {
    this.starsDisabled = starsDisabled;
    return this;
  }

   /**
   * Get starsDisabled
   * @return starsDisabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getStarsDisabled() {
    return starsDisabled;
  }

  public void setStarsDisabled(Boolean starsDisabled) {
    this.starsDisabled = starsDisabled;
  }

  public GeneralRepoSettings timeTrackingDisabled(Boolean timeTrackingDisabled) {
    this.timeTrackingDisabled = timeTrackingDisabled;
    return this;
  }

   /**
   * Get timeTrackingDisabled
   * @return timeTrackingDisabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTimeTrackingDisabled() {
    return timeTrackingDisabled;
  }

  public void setTimeTrackingDisabled(Boolean timeTrackingDisabled) {
    this.timeTrackingDisabled = timeTrackingDisabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralRepoSettings generalRepoSettings = (GeneralRepoSettings) o;
    return Objects.equals(this.httpGitDisabled, generalRepoSettings.httpGitDisabled) &&
        Objects.equals(this.lfsDisabled, generalRepoSettings.lfsDisabled) &&
        Objects.equals(this.migrationsDisabled, generalRepoSettings.migrationsDisabled) &&
        Objects.equals(this.mirrorsDisabled, generalRepoSettings.mirrorsDisabled) &&
        Objects.equals(this.starsDisabled, generalRepoSettings.starsDisabled) &&
        Objects.equals(this.timeTrackingDisabled, generalRepoSettings.timeTrackingDisabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpGitDisabled, lfsDisabled, migrationsDisabled, mirrorsDisabled, starsDisabled, timeTrackingDisabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralRepoSettings {\n");
    
    sb.append("    httpGitDisabled: ").append(toIndentedString(httpGitDisabled)).append("\n");
    sb.append("    lfsDisabled: ").append(toIndentedString(lfsDisabled)).append("\n");
    sb.append("    migrationsDisabled: ").append(toIndentedString(migrationsDisabled)).append("\n");
    sb.append("    mirrorsDisabled: ").append(toIndentedString(mirrorsDisabled)).append("\n");
    sb.append("    starsDisabled: ").append(toIndentedString(starsDisabled)).append("\n");
    sb.append("    timeTrackingDisabled: ").append(toIndentedString(timeTrackingDisabled)).append("\n");
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
