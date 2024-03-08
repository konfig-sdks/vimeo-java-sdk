

# PaymentMethod


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The ID of the account. |  |
|**card** | [**PaymentMethodCard**](PaymentMethodCard.md) |  |  [optional] |
|**createdAt** | **String** | The time when the payment method was created. |  |
|**disabledAt** | **String** | The time when the payment method was disabled. |  |
|**id** | **String** | The ID of the payment method. |  |
|**isDefault** | **Boolean** | Whether the payment method is the default payment method for the account. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of payment method.  Option descriptions:  * &#x60;0&#x60; - The payment method type is unspecified.  * &#x60;1&#x60; - The payment method is a card.  * &#x60;2&#x60; - The payment method is a PayPal account.  * &#x60;3&#x60; - The payment method is a bank account.  * &#x60;4&#x60; - The payment method is Apple Pay.  * &#x60;5&#x60; - The payment method is Google Pay.  |  |
|**updatedAt** | **String** | The time when the payment method was last updated. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |



