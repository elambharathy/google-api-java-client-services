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

package com.google.api.services.androidpublisher.model;

/**
 * A SubscriptionPurchase resource indicates the status of a user's subscription purchase.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubscriptionPurchase extends com.google.api.client.json.GenericJson {

  /**
   * The acknowledgement state of the subscription product. Possible values are: - Yet to be
   * acknowledged  - Acknowledged
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer acknowledgementState;

  /**
   * Whether the subscription will automatically be renewed when it reaches its current expiry time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoRenewing;

  /**
   * Time at which the subscription will be automatically resumed, in milliseconds since the Epoch.
   * Only present if the user has requested to pause the subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long autoResumeTimeMillis;

  /**
   * The reason why a subscription was canceled or is not auto-renewing. Possible values are: - User
   * canceled the subscription  - Subscription was canceled by the system, for example because of a
   * billing problem  - Subscription was replaced with a new subscription  - Subscription was
   * canceled by the developer
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer cancelReason;

  /**
   * Information provided by the user when they complete the subscription cancellation flow
   * (cancellation reason survey).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SubscriptionCancelSurveyResult cancelSurveyResult;

  /**
   * ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was
   * granted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * A developer-specified string that contains supplemental information about an order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String developerPayload;

  /**
   * The email address of the user when the subscription was purchased. Only present for purchases
   * made with 'Subscribe with Google'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emailAddress;

  /**
   * Time at which the subscription will expire, in milliseconds since the Epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiryTimeMillis;

  /**
   * The family name of the user when the subscription was purchased. Only present for purchases
   * made with 'Subscribe with Google'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String familyName;

  /**
   * The given name of the user when the subscription was purchased. Only present for purchases made
   * with 'Subscribe with Google'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String givenName;

  /**
   * This kind represents a subscriptionPurchase object in the androidpublisher service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The purchase token of the originating purchase if this subscription is one of the following: -
   * Re-signup of a canceled but non-lapsed subscription  - Upgrade/downgrade from a previous
   * subscription  For example, suppose a user originally signs up and you receive purchase token X,
   * then the user cancels and goes through the resignup flow (before their subscription lapses) and
   * you receive purchase token Y, and finally the user upgrades their subscription and you receive
   * purchase token Z. If you call this API with purchase token Z, this field will be set to Y. If
   * you call this API with purchase token Y, this field will be set to X. If you call this API with
   * purchase token X, this field will not be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkedPurchaseToken;

  /**
   * The order id of the latest recurring order associated with the purchase of the subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderId;

  /**
   * The payment state of the subscription. Possible values are: - Payment pending  - Payment
   * received  - Free trial  - Pending deferred upgrade/downgrade
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer paymentState;

  /**
   * Price of the subscription, not including tax. Price is expressed in micro-units, where
   * 1,000,000 micro-units represents one unit of the currency. For example, if the subscription
   * price is €1.99, price_amount_micros is 1990000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long priceAmountMicros;

  /**
   * The latest price change information available. This is present only when there is an upcoming
   * price change for the subscription yet to be applied.
   *
   * Once the subscription renews with the new price or the subscription is canceled, no price
   * change information will be returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SubscriptionPriceChange priceChange;

  /**
   * ISO 4217 currency code for the subscription price. For example, if the price is specified in
   * British pounds sterling, price_currency_code is "GBP".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String priceCurrencyCode;

  /**
   * The profile id of the user when the subscription was purchased. Only present for purchases made
   * with 'Subscribe with Google'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profileId;

  /**
   * The profile name of the user when the subscription was purchased. Only present for purchases
   * made with 'Subscribe with Google'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profileName;

  /**
   * The type of purchase of the subscription. This field is only set if this purchase was not made
   * using the standard in-app billing flow. Possible values are: - Test (i.e. purchased from a
   * license testing account)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer purchaseType;

  /**
   * Time at which the subscription was granted, in milliseconds since the Epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startTimeMillis;

  /**
   * The time at which the subscription was canceled by the user, in milliseconds since the epoch.
   * Only present if cancelReason is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long userCancellationTimeMillis;

  /**
   * The acknowledgement state of the subscription product. Possible values are: - Yet to be
   * acknowledged  - Acknowledged
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAcknowledgementState() {
    return acknowledgementState;
  }

  /**
   * The acknowledgement state of the subscription product. Possible values are: - Yet to be
   * acknowledged  - Acknowledged
   * @param acknowledgementState acknowledgementState or {@code null} for none
   */
  public SubscriptionPurchase setAcknowledgementState(java.lang.Integer acknowledgementState) {
    this.acknowledgementState = acknowledgementState;
    return this;
  }

  /**
   * Whether the subscription will automatically be renewed when it reaches its current expiry time.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoRenewing() {
    return autoRenewing;
  }

  /**
   * Whether the subscription will automatically be renewed when it reaches its current expiry time.
   * @param autoRenewing autoRenewing or {@code null} for none
   */
  public SubscriptionPurchase setAutoRenewing(java.lang.Boolean autoRenewing) {
    this.autoRenewing = autoRenewing;
    return this;
  }

  /**
   * Time at which the subscription will be automatically resumed, in milliseconds since the Epoch.
   * Only present if the user has requested to pause the subscription.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAutoResumeTimeMillis() {
    return autoResumeTimeMillis;
  }

  /**
   * Time at which the subscription will be automatically resumed, in milliseconds since the Epoch.
   * Only present if the user has requested to pause the subscription.
   * @param autoResumeTimeMillis autoResumeTimeMillis or {@code null} for none
   */
  public SubscriptionPurchase setAutoResumeTimeMillis(java.lang.Long autoResumeTimeMillis) {
    this.autoResumeTimeMillis = autoResumeTimeMillis;
    return this;
  }

  /**
   * The reason why a subscription was canceled or is not auto-renewing. Possible values are: - User
   * canceled the subscription  - Subscription was canceled by the system, for example because of a
   * billing problem  - Subscription was replaced with a new subscription  - Subscription was
   * canceled by the developer
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCancelReason() {
    return cancelReason;
  }

  /**
   * The reason why a subscription was canceled or is not auto-renewing. Possible values are: - User
   * canceled the subscription  - Subscription was canceled by the system, for example because of a
   * billing problem  - Subscription was replaced with a new subscription  - Subscription was
   * canceled by the developer
   * @param cancelReason cancelReason or {@code null} for none
   */
  public SubscriptionPurchase setCancelReason(java.lang.Integer cancelReason) {
    this.cancelReason = cancelReason;
    return this;
  }

  /**
   * Information provided by the user when they complete the subscription cancellation flow
   * (cancellation reason survey).
   * @return value or {@code null} for none
   */
  public SubscriptionCancelSurveyResult getCancelSurveyResult() {
    return cancelSurveyResult;
  }

  /**
   * Information provided by the user when they complete the subscription cancellation flow
   * (cancellation reason survey).
   * @param cancelSurveyResult cancelSurveyResult or {@code null} for none
   */
  public SubscriptionPurchase setCancelSurveyResult(SubscriptionCancelSurveyResult cancelSurveyResult) {
    this.cancelSurveyResult = cancelSurveyResult;
    return this;
  }

  /**
   * ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was
   * granted.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was
   * granted.
   * @param countryCode countryCode or {@code null} for none
   */
  public SubscriptionPurchase setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * A developer-specified string that contains supplemental information about an order.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeveloperPayload() {
    return developerPayload;
  }

  /**
   * A developer-specified string that contains supplemental information about an order.
   * @param developerPayload developerPayload or {@code null} for none
   */
  public SubscriptionPurchase setDeveloperPayload(java.lang.String developerPayload) {
    this.developerPayload = developerPayload;
    return this;
  }

  /**
   * The email address of the user when the subscription was purchased. Only present for purchases
   * made with 'Subscribe with Google'.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmailAddress() {
    return emailAddress;
  }

  /**
   * The email address of the user when the subscription was purchased. Only present for purchases
   * made with 'Subscribe with Google'.
   * @param emailAddress emailAddress or {@code null} for none
   */
  public SubscriptionPurchase setEmailAddress(java.lang.String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Time at which the subscription will expire, in milliseconds since the Epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiryTimeMillis() {
    return expiryTimeMillis;
  }

  /**
   * Time at which the subscription will expire, in milliseconds since the Epoch.
   * @param expiryTimeMillis expiryTimeMillis or {@code null} for none
   */
  public SubscriptionPurchase setExpiryTimeMillis(java.lang.Long expiryTimeMillis) {
    this.expiryTimeMillis = expiryTimeMillis;
    return this;
  }

  /**
   * The family name of the user when the subscription was purchased. Only present for purchases
   * made with 'Subscribe with Google'.
   * @return value or {@code null} for none
   */
  public java.lang.String getFamilyName() {
    return familyName;
  }

  /**
   * The family name of the user when the subscription was purchased. Only present for purchases
   * made with 'Subscribe with Google'.
   * @param familyName familyName or {@code null} for none
   */
  public SubscriptionPurchase setFamilyName(java.lang.String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * The given name of the user when the subscription was purchased. Only present for purchases made
   * with 'Subscribe with Google'.
   * @return value or {@code null} for none
   */
  public java.lang.String getGivenName() {
    return givenName;
  }

  /**
   * The given name of the user when the subscription was purchased. Only present for purchases made
   * with 'Subscribe with Google'.
   * @param givenName givenName or {@code null} for none
   */
  public SubscriptionPurchase setGivenName(java.lang.String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * This kind represents a subscriptionPurchase object in the androidpublisher service.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This kind represents a subscriptionPurchase object in the androidpublisher service.
   * @param kind kind or {@code null} for none
   */
  public SubscriptionPurchase setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The purchase token of the originating purchase if this subscription is one of the following: -
   * Re-signup of a canceled but non-lapsed subscription  - Upgrade/downgrade from a previous
   * subscription  For example, suppose a user originally signs up and you receive purchase token X,
   * then the user cancels and goes through the resignup flow (before their subscription lapses) and
   * you receive purchase token Y, and finally the user upgrades their subscription and you receive
   * purchase token Z. If you call this API with purchase token Z, this field will be set to Y. If
   * you call this API with purchase token Y, this field will be set to X. If you call this API with
   * purchase token X, this field will not be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkedPurchaseToken() {
    return linkedPurchaseToken;
  }

  /**
   * The purchase token of the originating purchase if this subscription is one of the following: -
   * Re-signup of a canceled but non-lapsed subscription  - Upgrade/downgrade from a previous
   * subscription  For example, suppose a user originally signs up and you receive purchase token X,
   * then the user cancels and goes through the resignup flow (before their subscription lapses) and
   * you receive purchase token Y, and finally the user upgrades their subscription and you receive
   * purchase token Z. If you call this API with purchase token Z, this field will be set to Y. If
   * you call this API with purchase token Y, this field will be set to X. If you call this API with
   * purchase token X, this field will not be set.
   * @param linkedPurchaseToken linkedPurchaseToken or {@code null} for none
   */
  public SubscriptionPurchase setLinkedPurchaseToken(java.lang.String linkedPurchaseToken) {
    this.linkedPurchaseToken = linkedPurchaseToken;
    return this;
  }

  /**
   * The order id of the latest recurring order associated with the purchase of the subscription.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderId() {
    return orderId;
  }

  /**
   * The order id of the latest recurring order associated with the purchase of the subscription.
   * @param orderId orderId or {@code null} for none
   */
  public SubscriptionPurchase setOrderId(java.lang.String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * The payment state of the subscription. Possible values are: - Payment pending  - Payment
   * received  - Free trial  - Pending deferred upgrade/downgrade
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPaymentState() {
    return paymentState;
  }

  /**
   * The payment state of the subscription. Possible values are: - Payment pending  - Payment
   * received  - Free trial  - Pending deferred upgrade/downgrade
   * @param paymentState paymentState or {@code null} for none
   */
  public SubscriptionPurchase setPaymentState(java.lang.Integer paymentState) {
    this.paymentState = paymentState;
    return this;
  }

  /**
   * Price of the subscription, not including tax. Price is expressed in micro-units, where
   * 1,000,000 micro-units represents one unit of the currency. For example, if the subscription
   * price is €1.99, price_amount_micros is 1990000.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPriceAmountMicros() {
    return priceAmountMicros;
  }

  /**
   * Price of the subscription, not including tax. Price is expressed in micro-units, where
   * 1,000,000 micro-units represents one unit of the currency. For example, if the subscription
   * price is €1.99, price_amount_micros is 1990000.
   * @param priceAmountMicros priceAmountMicros or {@code null} for none
   */
  public SubscriptionPurchase setPriceAmountMicros(java.lang.Long priceAmountMicros) {
    this.priceAmountMicros = priceAmountMicros;
    return this;
  }

  /**
   * The latest price change information available. This is present only when there is an upcoming
   * price change for the subscription yet to be applied.
   *
   * Once the subscription renews with the new price or the subscription is canceled, no price
   * change information will be returned.
   * @return value or {@code null} for none
   */
  public SubscriptionPriceChange getPriceChange() {
    return priceChange;
  }

  /**
   * The latest price change information available. This is present only when there is an upcoming
   * price change for the subscription yet to be applied.
   *
   * Once the subscription renews with the new price or the subscription is canceled, no price
   * change information will be returned.
   * @param priceChange priceChange or {@code null} for none
   */
  public SubscriptionPurchase setPriceChange(SubscriptionPriceChange priceChange) {
    this.priceChange = priceChange;
    return this;
  }

  /**
   * ISO 4217 currency code for the subscription price. For example, if the price is specified in
   * British pounds sterling, price_currency_code is "GBP".
   * @return value or {@code null} for none
   */
  public java.lang.String getPriceCurrencyCode() {
    return priceCurrencyCode;
  }

  /**
   * ISO 4217 currency code for the subscription price. For example, if the price is specified in
   * British pounds sterling, price_currency_code is "GBP".
   * @param priceCurrencyCode priceCurrencyCode or {@code null} for none
   */
  public SubscriptionPurchase setPriceCurrencyCode(java.lang.String priceCurrencyCode) {
    this.priceCurrencyCode = priceCurrencyCode;
    return this;
  }

  /**
   * The profile id of the user when the subscription was purchased. Only present for purchases made
   * with 'Subscribe with Google'.
   * @return value or {@code null} for none
   */
  public java.lang.String getProfileId() {
    return profileId;
  }

  /**
   * The profile id of the user when the subscription was purchased. Only present for purchases made
   * with 'Subscribe with Google'.
   * @param profileId profileId or {@code null} for none
   */
  public SubscriptionPurchase setProfileId(java.lang.String profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * The profile name of the user when the subscription was purchased. Only present for purchases
   * made with 'Subscribe with Google'.
   * @return value or {@code null} for none
   */
  public java.lang.String getProfileName() {
    return profileName;
  }

  /**
   * The profile name of the user when the subscription was purchased. Only present for purchases
   * made with 'Subscribe with Google'.
   * @param profileName profileName or {@code null} for none
   */
  public SubscriptionPurchase setProfileName(java.lang.String profileName) {
    this.profileName = profileName;
    return this;
  }

  /**
   * The type of purchase of the subscription. This field is only set if this purchase was not made
   * using the standard in-app billing flow. Possible values are: - Test (i.e. purchased from a
   * license testing account)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPurchaseType() {
    return purchaseType;
  }

  /**
   * The type of purchase of the subscription. This field is only set if this purchase was not made
   * using the standard in-app billing flow. Possible values are: - Test (i.e. purchased from a
   * license testing account)
   * @param purchaseType purchaseType or {@code null} for none
   */
  public SubscriptionPurchase setPurchaseType(java.lang.Integer purchaseType) {
    this.purchaseType = purchaseType;
    return this;
  }

  /**
   * Time at which the subscription was granted, in milliseconds since the Epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartTimeMillis() {
    return startTimeMillis;
  }

  /**
   * Time at which the subscription was granted, in milliseconds since the Epoch.
   * @param startTimeMillis startTimeMillis or {@code null} for none
   */
  public SubscriptionPurchase setStartTimeMillis(java.lang.Long startTimeMillis) {
    this.startTimeMillis = startTimeMillis;
    return this;
  }

  /**
   * The time at which the subscription was canceled by the user, in milliseconds since the epoch.
   * Only present if cancelReason is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUserCancellationTimeMillis() {
    return userCancellationTimeMillis;
  }

  /**
   * The time at which the subscription was canceled by the user, in milliseconds since the epoch.
   * Only present if cancelReason is 0.
   * @param userCancellationTimeMillis userCancellationTimeMillis or {@code null} for none
   */
  public SubscriptionPurchase setUserCancellationTimeMillis(java.lang.Long userCancellationTimeMillis) {
    this.userCancellationTimeMillis = userCancellationTimeMillis;
    return this;
  }

  @Override
  public SubscriptionPurchase set(String fieldName, Object value) {
    return (SubscriptionPurchase) super.set(fieldName, value);
  }

  @Override
  public SubscriptionPurchase clone() {
    return (SubscriptionPurchase) super.clone();
  }

}
