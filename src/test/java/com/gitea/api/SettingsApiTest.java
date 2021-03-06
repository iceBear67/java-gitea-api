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


package com.gitea.api;

import com.gitea.ApiException;
import com.gitea.model.GeneralAPISettings;
import com.gitea.model.GeneralAttachmentSettings;
import com.gitea.model.GeneralRepoSettings;
import com.gitea.model.GeneralUISettings;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SettingsApi
 */
public class SettingsApiTest {

    private final SettingsApi api = new SettingsApi();

    
    /**
     * Get instance&#39;s global settings for api
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGeneralAPISettingsTest() throws ApiException {
        // GeneralAPISettings response = api.getGeneralAPISettings();

        // TODO: test validations
    }
    
    /**
     * Get instance&#39;s global settings for Attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGeneralAttachmentSettingsTest() throws ApiException {
        // GeneralAttachmentSettings response = api.getGeneralAttachmentSettings();

        // TODO: test validations
    }
    
    /**
     * Get instance&#39;s global settings for repositories
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGeneralRepositorySettingsTest() throws ApiException {
        // GeneralRepoSettings response = api.getGeneralRepositorySettings();

        // TODO: test validations
    }
    
    /**
     * Get instance&#39;s global settings for ui
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGeneralUISettingsTest() throws ApiException {
        // GeneralUISettings response = api.getGeneralUISettings();

        // TODO: test validations
    }
    
}
