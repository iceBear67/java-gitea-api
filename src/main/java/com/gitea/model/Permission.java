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
 * Permission represents a set of permissions
 */
@ApiModel(description = "Permission represents a set of permissions")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T10:42:04.488+08:00")
public class Permission   {
  @SerializedName("admin")
  private Boolean admin = null;

  @SerializedName("pull")
  private Boolean pull = null;

  @SerializedName("push")
  private Boolean push = null;

  public Permission admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

   /**
   * Get admin
   * @return admin
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public Permission pull(Boolean pull) {
    this.pull = pull;
    return this;
  }

   /**
   * Get pull
   * @return pull
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPull() {
    return pull;
  }

  public void setPull(Boolean pull) {
    this.pull = pull;
  }

  public Permission push(Boolean push) {
    this.push = push;
    return this;
  }

   /**
   * Get push
   * @return push
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPush() {
    return push;
  }

  public void setPush(Boolean push) {
    this.push = push;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(this.admin, permission.admin) &&
        Objects.equals(this.pull, permission.pull) &&
        Objects.equals(this.push, permission.push);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, pull, push);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    pull: ").append(toIndentedString(pull)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
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

