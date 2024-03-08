

# SubscriptionPlansMetadataEntitlementsParams

The list of entitlement parameters corresponding to the tier.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**teamSeats** | **String** | The number of team seats included with the tier. |  |
|**videoStoragePeriodicQuota** | **String** | The amount of video storage for the user&#39;s periodic quota. |  |
|**videoStorageQuotaCap** | **String** | The video storage total lifetime cap. |  |
|**videoStorageQuotaPeriod** | [**VideoStorageQuotaPeriodEnum**](#VideoStorageQuotaPeriodEnum) | The video storage quota period.  Option descriptions:  * &#x60;lifetime&#x60; - The product has a lifetime video storage quota period.  * &#x60;month&#x60; - The product has a monthly video storage quota period.  * &#x60;week&#x60; - The product has a weekly video storage quota period.  * &#x60;year&#x60; - The product has a yearly video storage quota period.  |  |
|**videoStorageQuotaUnit** | [**VideoStorageQuotaUnitEnum**](#VideoStorageQuotaUnitEnum) | The unit of the video storage for the user&#39;s periodic quota.  Option descriptions:  * &#x60;video_count&#x60; - The product has video storage based on video count.  * &#x60;video_size&#x60; - The product has video storage based on video size.  |  |



## Enum: VideoStorageQuotaPeriodEnum

| Name | Value |
|---- | -----|
| LIFETIME | &quot;lifetime&quot; |
| MONTH | &quot;month&quot; |
| WEEK | &quot;week&quot; |
| YEAR | &quot;year&quot; |



## Enum: VideoStorageQuotaUnitEnum

| Name | Value |
|---- | -----|
| COUNT | &quot;video_count&quot; |
| SIZE | &quot;video_size&quot; |



