

# UserUploadQuotaLifetime

Information about the authenticated user's lifetime upload usage.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**free** | **Double** | The number of bytes or videos remaining in the authenticated user&#39;s lifetime maximum. |  |
|**max** | **Double** | The total number of bytes or videos that the authenticated user can upload across the lifetime of their account. |  |
|**unit** | [**UnitEnum**](#UnitEnum) | The unit that&#39;s used to compute quota.  Option descriptions:  * &#x60;video_count&#x60; - The quota is calculated using the count of the videos.  * &#x60;video_size&#x60; - The quota is calculated using the byte size of the videos.  |  |
|**used** | **Double** | The number of bytes or videos that the authenticated user has already uploaded against their lifetime limit. |  |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| COUNT | &quot;video_count&quot; |
| SIZE | &quot;video_size&quot; |



