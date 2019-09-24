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

package com.google.api.services.run.v1.model;

/**
 * Cloud Run fully managed: not supported
 *
 * Cloud Run for Anthos: supported
 *
 * SecretKeySelector selects a key of a Secret.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecretKeySelector extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * The key of the secret to select from.  Must be a valid secret key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * The name of the secret in the pod's namespace to select from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocalObjectReference localObjectReference;

  /**
   * (Optional)
   *
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * Specify whether the Secret or its key must be defined
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean optional;

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * The key of the secret to select from.  Must be a valid secret key.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * The key of the secret to select from.  Must be a valid secret key.
   * @param key key or {@code null} for none
   */
  public SecretKeySelector setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * The name of the secret in the pod's namespace to select from.
   * @return value or {@code null} for none
   */
  public LocalObjectReference getLocalObjectReference() {
    return localObjectReference;
  }

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * The name of the secret in the pod's namespace to select from.
   * @param localObjectReference localObjectReference or {@code null} for none
   */
  public SecretKeySelector setLocalObjectReference(LocalObjectReference localObjectReference) {
    this.localObjectReference = localObjectReference;
    return this;
  }

  /**
   * (Optional)
   *
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * Specify whether the Secret or its key must be defined
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOptional() {
    return optional;
  }

  /**
   * (Optional)
   *
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * Specify whether the Secret or its key must be defined
   * @param optional optional or {@code null} for none
   */
  public SecretKeySelector setOptional(java.lang.Boolean optional) {
    this.optional = optional;
    return this;
  }

  @Override
  public SecretKeySelector set(String fieldName, Object value) {
    return (SecretKeySelector) super.set(fieldName, value);
  }

  @Override
  public SecretKeySelector clone() {
    return (SecretKeySelector) super.clone();
  }

}