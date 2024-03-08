

# OnDemandPromotionsAddPromotionToPageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessType** | [**AccessTypeEnum**](#AccessTypeEnum) | The promotion access type, which is a purchase option that isn&#39;t available in the On Demand container. Use the **download** and **stream_period** parameters to define additional characteristics for the &#x60;vip&#x60; type.  Option descriptions:  * &#x60;default&#x60; - The promotion grants a discount on the existing purchase options for an On Demand container.  * &#x60;vip&#x60; - The promotion grants free access to On Demand content before it&#39;s released.  |  [optional] |
|**code** | **String** | The promotion code. This parameter is ignored when the promotion type is &#x60;batch&#x60;. |  [optional] |
|**discountType** | [**DiscountTypeEnum**](#DiscountTypeEnum) | The type of discount offered by the promotion code. When **access_type** is &#x60;vip&#x60;, the value of this parameter must be &#x60;free&#x60;.  Option descriptions:  * &#x60;free&#x60; - The discount reduces the price to zero.  * &#x60;percent&#x60; - The discount reduces the price by the percentage defined in the **percent_off** parameter.  |  [optional] |
|**download** | **Boolean** | Whether the promotion grants download access to On Demand content. This field is required only when the download access hasn&#39;t been defined in the On Demand container, or when **access_type** is &#x60;vip&#x60; or **product_type** is &#x60;buy&#x60;. |  |
|**endTime** | **String** | The time at which the promotion period ends. If this parameter has no value, the promotion never expires. |  [optional] |
|**label** | **String** | The description of the promotion when the promotion type is &#x60;batch&#x60;. This parameter is ignored when the promotion type is &#x60;single&#x60;. |  [optional] |
|**percentOff** | **Double** | The percentage of the discount. This parameter is applicable only when **discount_type** is &#x60;percent&#x60;. |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | The type of transaction to which the promotion applies. When **access_type** is &#x60;default&#x60;, the default value is &#x60;any&#x60;. When **access_type** is &#x60;vip&#x60;, the default value is &#x60;rent&#x60; and the only valid product types are &#x60;buy&#x60; and &#x60;rent&#x60;.  Option descriptions:  * &#x60;any&#x60; - The promotion applies to any transaction.  * &#x60;buy&#x60; - The promotion applies only to purchased products.  * &#x60;buy_episode&#x60; - The promotion applies only to purchased episodes.  * &#x60;rent&#x60; - The promotion applies only to rented products.  * &#x60;rent_episode&#x60; - The promotion applies only to rented episodes.  * &#x60;subscribe&#x60; - The promotion applies only to subscriptions.  |  [optional] |
|**startTime** | **String** | The time at which the promotion period starts. If this parameter has no value, the start time defaults to the time at which the promotion was created. |  [optional] |
|**streamPeriod** | [**StreamPeriodEnum**](#StreamPeriodEnum) | The amount of time for which the user can access On Demand content upon redeeming a promotion code. This parameter is required only when the streaming period isn&#39;t defined in the On Demand container, or when creating promotions where **access_type** is &#x60;vip&#x60; or **product_type** is &#x60;rent&#x60;.  Option descriptions:  * &#x60;1_week&#x60; - The user can access On Demand content for a maximum of 1 week after redeeming a promotion code.  * &#x60;1_year&#x60; - The user can access On Demand content for a maximum of 1 year after redeeming a promotion code.  * &#x60;24_hour&#x60; - The user can access On Demand content for a maximum of 24 hours after redeeming a promotion code.  * &#x60;30_day&#x60; - The user can access On Demand content for a maximum of 30 days after redeeming a promotion code.  * &#x60;3_month&#x60; - The user can access On Demand content for a maximum of 3 months after redeeming a promotion code.  * &#x60;48_hour&#x60; - The user can access On Demand content for a maximum of 48 hours after redeeming a promotion code.  * &#x60;6_month&#x60; - The user can access On Demand content for a maximum of 6 months after redeeming a promotion code.  * &#x60;72_hour&#x60; - The user can access On Demand content for a maximum of 72 hours after redeeming a promotion code.  |  |
|**total** | **Double** | When **type** is &#x60;batch&#x60;, the total number of promotions to generate. When **type** is &#x60;single&#x60;, the total number of uses of the promotion. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the promotion. When **access_type** is &#x60;vip&#x60;, the value for this parameter must be &#x60;batch&#x60;.  Option descriptions:  * &#x60;batch&#x60; - The promotion type that generates many random codes to use one time each.  * &#x60;single&#x60; - The promotion type that generates one code to use many times.  |  |



## Enum: AccessTypeEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| VIP | &quot;vip&quot; |



## Enum: DiscountTypeEnum

| Name | Value |
|---- | -----|
| FREE | &quot;free&quot; |
| PERCENT | &quot;percent&quot; |



## Enum: ProductTypeEnum

| Name | Value |
|---- | -----|
| ANY | &quot;any&quot; |
| BUY | &quot;buy&quot; |
| BUY_EPISODE | &quot;buy_episode&quot; |
| RENT | &quot;rent&quot; |
| RENT_EPISODE | &quot;rent_episode&quot; |
| SUBSCRIBE | &quot;subscribe&quot; |



## Enum: StreamPeriodEnum

| Name | Value |
|---- | -----|
| _1_WEEK | &quot;1_week&quot; |
| _1_YEAR | &quot;1_year&quot; |
| _24_HOUR | &quot;24_hour&quot; |
| _30_DAY | &quot;30_day&quot; |
| _3_MONTH | &quot;3_month&quot; |
| _48_HOUR | &quot;48_hour&quot; |
| _6_MONTH | &quot;6_month&quot; |
| _72_HOUR | &quot;72_hour&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BATCH | &quot;batch&quot; |
| SINGLE | &quot;single&quot; |



