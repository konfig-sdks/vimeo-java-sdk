

# OnDemandEssentialsCreatePageRequestRent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Whether the video can be rented. This parameter is required when **episodes.rent.active** is &#x60;true&#x60;. |  [optional] |
|**period** | [**PeriodEnum**](#PeriodEnum) | The rental period of the video.  Option descriptions:  * &#x60;1 week&#x60; - The video can be rented for a maximum of 1 week.  * &#x60;1 year&#x60; - The video can be rented for a maximum of 1 year.  * &#x60;24 hour&#x60; - The video can be rented for a maximum of 24 hours.  * &#x60;3 month&#x60; - The video can be rented for a maximum of 3 months.  * &#x60;30 day&#x60; - The video can be rented for a maximum of 30 days.  * &#x60;48 hour&#x60; - The video can be rented for a maximum of 48 hours.  * &#x60;6 month&#x60; - The video can be rented for a maximum of 6 months.  * &#x60;72 hour&#x60; - The video can be rented for a maximum of 72 hours.  |  [optional] |
|**price** | [**OnDemandEssentialsCreatePageRequestRentPrice**](OnDemandEssentialsCreatePageRequestRentPrice.md) |  |  [optional] |



## Enum: PeriodEnum

| Name | Value |
|---- | -----|
| _1_WEEK | &quot;1 week&quot; |
| _1_YEAR | &quot;1 year&quot; |
| _24_HOUR | &quot;24 hour&quot; |
| _3_MONTH | &quot;3 month&quot; |
| _30_DAY | &quot;30 day&quot; |
| _48_HOUR | &quot;48 hour&quot; |
| _6_MONTH | &quot;6 month&quot; |
| _72_HOUR | &quot;72 hour&quot; |



