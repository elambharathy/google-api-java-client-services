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

package com.google.api.services.healthcare.v1.model;

/**
 * Imports data into the specified DICOM store. Returns an error if any of the files to import are
 * not DICOM files. This API accepts duplicate DICOM instances by ignoring the newly-pushed
 * instance. It does not overwrite.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportDicomDataRequest extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Storage source data location and import configuration. The Cloud Storage location
   * requires the `roles/storage.objectViewer` Cloud IAM role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudHealthcareV1DicomGcsSource gcsSource;

  /**
   * Cloud Storage source data location and import configuration. The Cloud Storage location
   * requires the `roles/storage.objectViewer` Cloud IAM role.
   * @return value or {@code null} for none
   */
  public GoogleCloudHealthcareV1DicomGcsSource getGcsSource() {
    return gcsSource;
  }

  /**
   * Cloud Storage source data location and import configuration. The Cloud Storage location
   * requires the `roles/storage.objectViewer` Cloud IAM role.
   * @param gcsSource gcsSource or {@code null} for none
   */
  public ImportDicomDataRequest setGcsSource(GoogleCloudHealthcareV1DicomGcsSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  @Override
  public ImportDicomDataRequest set(String fieldName, Object value) {
    return (ImportDicomDataRequest) super.set(fieldName, value);
  }

  @Override
  public ImportDicomDataRequest clone() {
    return (ImportDicomDataRequest) super.clone();
  }

}
