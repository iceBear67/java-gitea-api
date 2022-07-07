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
import com.gitea.model.StateType;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * Milestone milestone is a collection of issues on one repository
 */
@ApiModel(description = "Milestone milestone is a collection of issues on one repository")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class Milestone   {
  @SerializedName("closed_at")
  private DateTime closedAt = null;

  @SerializedName("closed_issues")
  private Long closedIssues = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("due_on")
  private DateTime dueOn = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("open_issues")
  private Long openIssues = null;

  @SerializedName("state")
  private StateType state = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public Milestone closedAt(DateTime closedAt) {
    this.closedAt = closedAt;
    return this;
  }

   /**
   * Get closedAt
   * @return closedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(DateTime closedAt) {
    this.closedAt = closedAt;
  }

  public Milestone closedIssues(Long closedIssues) {
    this.closedIssues = closedIssues;
    return this;
  }

   /**
   * Get closedIssues
   * @return closedIssues
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getClosedIssues() {
    return closedIssues;
  }

  public void setClosedIssues(Long closedIssues) {
    this.closedIssues = closedIssues;
  }

  public Milestone createdAt(DateTime createdAt) {
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

  public Milestone description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Milestone dueOn(DateTime dueOn) {
    this.dueOn = dueOn;
    return this;
  }

   /**
   * Get dueOn
   * @return dueOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDueOn() {
    return dueOn;
  }

  public void setDueOn(DateTime dueOn) {
    this.dueOn = dueOn;
  }

  public Milestone id(Long id) {
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

  public Milestone openIssues(Long openIssues) {
    this.openIssues = openIssues;
    return this;
  }

   /**
   * Get openIssues
   * @return openIssues
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getOpenIssues() {
    return openIssues;
  }

  public void setOpenIssues(Long openIssues) {
    this.openIssues = openIssues;
  }

  public Milestone state(StateType state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public StateType getState() {
    return state;
  }

  public void setState(StateType state) {
    this.state = state;
  }

  public Milestone title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Milestone updatedAt(DateTime updatedAt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Milestone milestone = (Milestone) o;
    return Objects.equals(this.closedAt, milestone.closedAt) &&
        Objects.equals(this.closedIssues, milestone.closedIssues) &&
        Objects.equals(this.createdAt, milestone.createdAt) &&
        Objects.equals(this.description, milestone.description) &&
        Objects.equals(this.dueOn, milestone.dueOn) &&
        Objects.equals(this.id, milestone.id) &&
        Objects.equals(this.openIssues, milestone.openIssues) &&
        Objects.equals(this.state, milestone.state) &&
        Objects.equals(this.title, milestone.title) &&
        Objects.equals(this.updatedAt, milestone.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closedAt, closedIssues, createdAt, description, dueOn, id, openIssues, state, title, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Milestone {\n");
    
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    closedIssues: ").append(toIndentedString(closedIssues)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    openIssues: ").append(toIndentedString(openIssues)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

