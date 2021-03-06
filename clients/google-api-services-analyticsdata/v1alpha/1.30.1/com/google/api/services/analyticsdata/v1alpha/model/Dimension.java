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

package com.google.api.services.analyticsdata.v1alpha.model;

/**
 * Dimensions are attributes of your data. For example, the dimension City indicates the city, for
 * example, "Paris" or "New York", from which an event originates. Requests are allowed up to 8
 * dimensions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Dimension extends com.google.api.client.json.GenericJson {

  /**
   * One dimension can be the result of an expression of multiple dimensions. For example, dimension
   * "country, city": concatenate(country, ", ", city).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionExpression dimensionExpression;

  /**
   * The name of the dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * One dimension can be the result of an expression of multiple dimensions. For example, dimension
   * "country, city": concatenate(country, ", ", city).
   * @return value or {@code null} for none
   */
  public DimensionExpression getDimensionExpression() {
    return dimensionExpression;
  }

  /**
   * One dimension can be the result of an expression of multiple dimensions. For example, dimension
   * "country, city": concatenate(country, ", ", city).
   * @param dimensionExpression dimensionExpression or {@code null} for none
   */
  public Dimension setDimensionExpression(DimensionExpression dimensionExpression) {
    this.dimensionExpression = dimensionExpression;
    return this;
  }

  /**
   * The name of the dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the dimension.
   * @param name name or {@code null} for none
   */
  public Dimension setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Dimension set(String fieldName, Object value) {
    return (Dimension) super.set(fieldName, value);
  }

  @Override
  public Dimension clone() {
    return (Dimension) super.clone();
  }

}
