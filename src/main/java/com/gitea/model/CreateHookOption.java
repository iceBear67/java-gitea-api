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
import com.gitea.model.CreateHookOptionConfig;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * CreateHookOption options when create a hook
 */
@ApiModel(description = "CreateHookOption options when create a hook")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class CreateHookOption   {
  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("branch_filter")
  private String branchFilter = null;

  @SerializedName("config")
  private CreateHookOptionConfig config = null;

  @SerializedName("events")
  private List<String> events = new ArrayList<String>();

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("dingtalk")
    DINGTALK("dingtalk"),
    
    @SerializedName("discord")
    DISCORD("discord"),
    
    @SerializedName("gitea")
    GITEA("gitea"),
    
    @SerializedName("gogs")
    GOGS("gogs"),
    
    @SerializedName("msteams")
    MSTEAMS("msteams"),
    
    @SerializedName("slack")
    SLACK("slack"),
    
    @SerializedName("telegram")
    TELEGRAM("telegram"),
    
    @SerializedName("feishu")
    FEISHU("feishu"),
    
    @SerializedName("wechatwork")
    WECHATWORK("wechatwork");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public CreateHookOption active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CreateHookOption branchFilter(String branchFilter) {
    this.branchFilter = branchFilter;
    return this;
  }

   /**
   * Get branchFilter
   * @return branchFilter
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBranchFilter() {
    return branchFilter;
  }

  public void setBranchFilter(String branchFilter) {
    this.branchFilter = branchFilter;
  }

  public CreateHookOption config(CreateHookOptionConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CreateHookOptionConfig getConfig() {
    return config;
  }

  public void setConfig(CreateHookOptionConfig config) {
    this.config = config;
  }

  public CreateHookOption events(List<String> events) {
    this.events = events;
    return this;
  }

  public CreateHookOption addEventsItem(String eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public CreateHookOption type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateHookOption createHookOption = (CreateHookOption) o;
    return Objects.equals(this.active, createHookOption.active) &&
        Objects.equals(this.branchFilter, createHookOption.branchFilter) &&
        Objects.equals(this.config, createHookOption.config) &&
        Objects.equals(this.events, createHookOption.events) &&
        Objects.equals(this.type, createHookOption.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, branchFilter, config, events, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateHookOption {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    branchFilter: ").append(toIndentedString(branchFilter)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

