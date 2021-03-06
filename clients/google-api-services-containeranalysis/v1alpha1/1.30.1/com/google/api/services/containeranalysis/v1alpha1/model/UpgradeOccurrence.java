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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * An Upgrade Occurrence represents that a specific resource_url could install a specific upgrade.
 * This presence is supplied via local sources (i.e. it is present in the mirror and the running
 * system has noticed its availability).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpgradeOccurrence extends com.google.api.client.json.GenericJson {

  /**
   * Metadata about the upgrade for available for the specific operating system for the
   * resource_url. This allows efficient filtering, as well as making it easier to use the
   * occurrence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UpgradeDistribution distribution;

  /**
   * Required - The package this Upgrade is for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("package")
  private java.lang.String package__;

  /**
   * Required - The version of the package in a machine + human readable form.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Version parsedVersion;

  /**
   * Metadata about the upgrade for available for the specific operating system for the
   * resource_url. This allows efficient filtering, as well as making it easier to use the
   * occurrence.
   * @return value or {@code null} for none
   */
  public UpgradeDistribution getDistribution() {
    return distribution;
  }

  /**
   * Metadata about the upgrade for available for the specific operating system for the
   * resource_url. This allows efficient filtering, as well as making it easier to use the
   * occurrence.
   * @param distribution distribution or {@code null} for none
   */
  public UpgradeOccurrence setDistribution(UpgradeDistribution distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * Required - The package this Upgrade is for.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackage() {
    return package__;
  }

  /**
   * Required - The package this Upgrade is for.
   * @param package__ package__ or {@code null} for none
   */
  public UpgradeOccurrence setPackage(java.lang.String package__) {
    this.package__ = package__;
    return this;
  }

  /**
   * Required - The version of the package in a machine + human readable form.
   * @return value or {@code null} for none
   */
  public Version getParsedVersion() {
    return parsedVersion;
  }

  /**
   * Required - The version of the package in a machine + human readable form.
   * @param parsedVersion parsedVersion or {@code null} for none
   */
  public UpgradeOccurrence setParsedVersion(Version parsedVersion) {
    this.parsedVersion = parsedVersion;
    return this;
  }

  @Override
  public UpgradeOccurrence set(String fieldName, Object value) {
    return (UpgradeOccurrence) super.set(fieldName, value);
  }

  @Override
  public UpgradeOccurrence clone() {
    return (UpgradeOccurrence) super.clone();
  }

}
