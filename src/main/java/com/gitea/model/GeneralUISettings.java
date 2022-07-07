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
import java.util.ArrayList;
import java.util.List;


/**
 * GeneralUISettings contains global ui settings exposed by API
 */
@ApiModel(description = "GeneralUISettings contains global ui settings exposed by API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class GeneralUISettings   {
  @SerializedName("allowed_reactions")
  private List<String> allowedReactions = new ArrayList<String>();

  @SerializedName("custom_emojis")
  private List<String> customEmojis = new ArrayList<String>();

  @SerializedName("default_theme")
  private String defaultTheme = null;

  public GeneralUISettings allowedReactions(List<String> allowedReactions) {
    this.allowedReactions = allowedReactions;
    return this;
  }

  public GeneralUISettings addAllowedReactionsItem(String allowedReactionsItem) {
    this.allowedReactions.add(allowedReactionsItem);
    return this;
  }

   /**
   * Get allowedReactions
   * @return allowedReactions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAllowedReactions() {
    return allowedReactions;
  }

  public void setAllowedReactions(List<String> allowedReactions) {
    this.allowedReactions = allowedReactions;
  }

  public GeneralUISettings customEmojis(List<String> customEmojis) {
    this.customEmojis = customEmojis;
    return this;
  }

  public GeneralUISettings addCustomEmojisItem(String customEmojisItem) {
    this.customEmojis.add(customEmojisItem);
    return this;
  }

   /**
   * Get customEmojis
   * @return customEmojis
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCustomEmojis() {
    return customEmojis;
  }

  public void setCustomEmojis(List<String> customEmojis) {
    this.customEmojis = customEmojis;
  }

  public GeneralUISettings defaultTheme(String defaultTheme) {
    this.defaultTheme = defaultTheme;
    return this;
  }

   /**
   * Get defaultTheme
   * @return defaultTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDefaultTheme() {
    return defaultTheme;
  }

  public void setDefaultTheme(String defaultTheme) {
    this.defaultTheme = defaultTheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralUISettings generalUISettings = (GeneralUISettings) o;
    return Objects.equals(this.allowedReactions, generalUISettings.allowedReactions) &&
        Objects.equals(this.customEmojis, generalUISettings.customEmojis) &&
        Objects.equals(this.defaultTheme, generalUISettings.defaultTheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedReactions, customEmojis, defaultTheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralUISettings {\n");
    
    sb.append("    allowedReactions: ").append(toIndentedString(allowedReactions)).append("\n");
    sb.append("    customEmojis: ").append(toIndentedString(customEmojis)).append("\n");
    sb.append("    defaultTheme: ").append(toIndentedString(defaultTheme)).append("\n");
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

