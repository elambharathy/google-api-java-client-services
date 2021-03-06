/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.healthcare.v1beta1.model;

/**
 * When using the INSPECT_AND_TRANSFORM action, each match is replaced with the name of the
 * info_type. For example, "My name is Jake" becomes "My name is [PERSON_NAME]." The TRANSFORM
 * action is equivalent to redacting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReplaceWithInfoTypeConfig extends com.google.api.client.json.GenericJson {

  @Override
  public ReplaceWithInfoTypeConfig set(String fieldName, Object value) {
    return (ReplaceWithInfoTypeConfig) super.set(fieldName, value);
  }

  @Override
  public ReplaceWithInfoTypeConfig clone() {
    return (ReplaceWithInfoTypeConfig) super.clone();
  }

}
