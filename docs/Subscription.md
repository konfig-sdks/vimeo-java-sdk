

# Subscription


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The ID of the account. |  [optional] |
|**autoRenew** | **Boolean** | Whether the subscription is set to auto-renew. |  |
|**createdAt** | **String** | The time in ISO 8601 format when the subscription was created. |  |
|**disabledAt** | **String** | The time in ISO 8601 format when the subscription was disabled. |  [optional] |
|**endDate** | **String** | The time in ISO 8601 format when the subscription ended. |  |
|**gracePeriodId** | **String** | The ID of the grace period. |  |
|**id** | **String** | The ID of the subscription. |  |
|**isLatest** | **Boolean** | Whether the subscription is the latest version. |  |
|**items** | [**List&lt;SubscriptionItemsInner&gt;**](SubscriptionItemsInner.md) | An array of items in the subscription. |  |
|**paymentMethodId** | **String** | The ID of the payment method. |  |
|**startDate** | **String** | The time in ISO 8601 format when the subscription started. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the subscription.  Option descriptions:  * &#x60;0&#x60; - The subscription status is unspecified.  * &#x60;1&#x60; - The subscription is active.  * &#x60;2&#x60; - The subscription is canceled.  * &#x60;3&#x60; - The subscription is in a grace period.  * &#x60;4&#x60; - The subscription is in a trial period.  * &#x60;5&#x60; - The subscription is past due.  * &#x60;6&#x60; - The subscription is unpaid.  |  |
|**subscriptionNumber** | **String** | The number of the subscription. |  |
|**subscriptionVersion** | **Double** | The version of the subscription. |  |
|**syncedAt** | **String** | The time in ISO 8601 format when the subscription was synced. |  |
|**updatedAt** | **String** | The time in ISO 8601 format when the subscription was updated. |  |
|**vendor** | **String** | The vendor of the subscription. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |



