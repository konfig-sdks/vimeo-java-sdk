

# UserUploadQuotaSpace

Information about the authenticated user's upload space remaining for the current period.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**free** | **Double** | The number of bytes or videos remaining in the authenticated user&#39;s upload quota. |  |
|**max** | **Double** | The maximum number of bytes or videos allotted to the authenticated user&#39;s upload quota. |  |
|**showing** | [**ShowingEnum**](#ShowingEnum) | The type of quota for the values of the **upload_quota.space** field.  Option descriptions:  * &#x60;lifetime&#x60; - The quota type is lifetime.  * &#x60;periodic&#x60; - The quota type is periodic.  |  |
|**unit** | [**UnitEnum**](#UnitEnum) | The unit that&#39;s used to compute quota.  Option descriptions:  * &#x60;video_count&#x60; - The quota is calculated using the count of the videos.  * &#x60;video_size&#x60; - The quota is calculated using the byte size of the videos.  |  |
|**used** | **Double** | The number of bytes or videos that the authenticated user has already uploaded against their quota. |  |



## Enum: ShowingEnum

| Name | Value |
|---- | -----|
| LIFETIME | &quot;lifetime&quot; |
| PERIODIC | &quot;periodic&quot; |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| COUNT | &quot;video_count&quot; |
| SIZE | &quot;video_size&quot; |



