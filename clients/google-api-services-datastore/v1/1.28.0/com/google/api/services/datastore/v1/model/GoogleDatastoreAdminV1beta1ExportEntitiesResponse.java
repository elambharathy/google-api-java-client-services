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

package com.google.api.services.datastore.v1.model;

/**
 * The response for google.datastore.admin.v1beta1.DatastoreAdmin.ExportEntities.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDatastoreAdminV1beta1ExportEntitiesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Location of the output metadata file. This can be used to begin an import into Cloud Datastore
   * (this project or another project). See
   * google.datastore.admin.v1beta1.ImportEntitiesRequest.input_url. Only present if the operation
   * completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputUrl;

  /**
   * Location of the output metadata file. This can be used to begin an import into Cloud Datastore
   * (this project or another project). See
   * google.datastore.admin.v1beta1.ImportEntitiesRequest.input_url. Only present if the operation
   * completed successfully.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputUrl() {
    return outputUrl;
  }

  /**
   * Location of the output metadata file. This can be used to begin an import into Cloud Datastore
   * (this project or another project). See
   * google.datastore.admin.v1beta1.ImportEntitiesRequest.input_url. Only present if the operation
   * completed successfully.
   * @param outputUrl outputUrl or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1ExportEntitiesResponse setOutputUrl(java.lang.String outputUrl) {
    this.outputUrl = outputUrl;
    return this;
  }

  @Override
  public GoogleDatastoreAdminV1beta1ExportEntitiesResponse set(String fieldName, Object value) {
    return (GoogleDatastoreAdminV1beta1ExportEntitiesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleDatastoreAdminV1beta1ExportEntitiesResponse clone() {
    return (GoogleDatastoreAdminV1beta1ExportEntitiesResponse) super.clone();
  }

}
