

# UserUploadQuotaPeriodic

Information about the authenticated user's usage for the current period.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**free** | **Double** | The number of bytes or video count remaining in the authenticated user&#39;s upload quota for the current period. |  |
|**max** | **Double** | The total number of bytes or videos that the authenticated user can upload per period. |  |
|**period** | [**PeriodEnum**](#PeriodEnum) | The renewal frequency of the quota.  Option descriptions:  * &#x60;lifetime&#x60; - The user doesn&#39;t have a periodic quota.  * &#x60;month&#x60; - The quota renews monthly.  * &#x60;week&#x60; - The quota renews weekly.  * &#x60;year&#x60; - The quota renews yearly.  |  |
|**resetDate** | **String** | The time in ISO 8601 format when the authenticated user&#39;s upload quota resets. |  |
|**unit** | [**UnitEnum**](#UnitEnum) | The unit that&#39;s used to compute quota.  Option descriptions:  * &#x60;video_count&#x60; - The quota is calculated using the count of the videos.  * &#x60;video_size&#x60; - The quota is calculated using the byte size of the videos.  |  |
|**used** | **Double** | The number of bytes or video count that the authenticated user has already uploaded against their quota in the current period. |  |



## Enum: PeriodEnum

| Name | Value |
|---- | -----|
| LIFETIME | &quot;lifetime&quot; |
| MONTH | &quot;month&quot; |
| WEEK | &quot;week&quot; |
| YEAR | &quot;year&quot; |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| COUNT | &quot;video_count&quot; |
| SIZE | &quot;video_size&quot; |



