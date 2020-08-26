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
 * Specifies where to send notifications upon changes to a data store.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NotificationConfig extends com.google.api.client.json.GenericJson {

  /**
   * The [Cloud Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes
   * are published on. Supplied by the client. PubsubMessage.Data contains the resource name.
   * PubsubMessage.MessageId is the ID of this message. It is guaranteed to be unique within the
   * topic. PubsubMessage.PublishTime is the time at which the message was published. Notifications
   * are only sent if the topic is non-empty. [Topic
   * names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. Cloud
   * Healthcare API service account must have publisher permissions on the given Cloud Pub/Sub
   * topic. Not having adequate permissions causes the calls that send notifications to fail. If a
   * notification can't be published to Cloud Pub/Sub, errors are logged to Cloud Logging (see
   * [Viewing logs](/healthcare/docs/how-tos/logging)). If the number of errors exceeds a certain
   * rate, some aren't submitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pubsubTopic;

  /**
   * The [Cloud Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes
   * are published on. Supplied by the client. PubsubMessage.Data contains the resource name.
   * PubsubMessage.MessageId is the ID of this message. It is guaranteed to be unique within the
   * topic. PubsubMessage.PublishTime is the time at which the message was published. Notifications
   * are only sent if the topic is non-empty. [Topic
   * names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. Cloud
   * Healthcare API service account must have publisher permissions on the given Cloud Pub/Sub
   * topic. Not having adequate permissions causes the calls that send notifications to fail. If a
   * notification can't be published to Cloud Pub/Sub, errors are logged to Cloud Logging (see
   * [Viewing logs](/healthcare/docs/how-tos/logging)). If the number of errors exceeds a certain
   * rate, some aren't submitted.
   * @return value or {@code null} for none
   */
  public java.lang.String getPubsubTopic() {
    return pubsubTopic;
  }

  /**
   * The [Cloud Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes
   * are published on. Supplied by the client. PubsubMessage.Data contains the resource name.
   * PubsubMessage.MessageId is the ID of this message. It is guaranteed to be unique within the
   * topic. PubsubMessage.PublishTime is the time at which the message was published. Notifications
   * are only sent if the topic is non-empty. [Topic
   * names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. Cloud
   * Healthcare API service account must have publisher permissions on the given Cloud Pub/Sub
   * topic. Not having adequate permissions causes the calls that send notifications to fail. If a
   * notification can't be published to Cloud Pub/Sub, errors are logged to Cloud Logging (see
   * [Viewing logs](/healthcare/docs/how-tos/logging)). If the number of errors exceeds a certain
   * rate, some aren't submitted.
   * @param pubsubTopic pubsubTopic or {@code null} for none
   */
  public NotificationConfig setPubsubTopic(java.lang.String pubsubTopic) {
    this.pubsubTopic = pubsubTopic;
    return this;
  }

  @Override
  public NotificationConfig set(String fieldName, Object value) {
    return (NotificationConfig) super.set(fieldName, value);
  }

  @Override
  public NotificationConfig clone() {
    return (NotificationConfig) super.clone();
  }

}
