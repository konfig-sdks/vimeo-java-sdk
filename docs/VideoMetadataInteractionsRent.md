

# VideoMetadataInteractionsRent

The Rent interaction for the On Demand video.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | The currency code for the user&#39;s region. |  |
|**displayPrice** | **String** | The formatted display price for renting the On Demand video. |  |
|**drm** | **Boolean** | Whether the On Demand video has DRM. |  |
|**expiresTime** | **String** | The time in ISO 8601 format when the rental period for the On Demand video expires. |  |
|**link** | **String** | The URL to rent the On Demand video on Vimeo. |  |
|**price** | **Double** | The price to buy the On Demand video. |  |
|**purchaseTime** | **String** | The time in ISO 8601 format when the On Demand video was rented. |  |
|**stream** | [**StreamEnum**](#StreamEnum) | The user&#39;s streaming access to the On Demand video.  Option descriptions:  * &#x60;available&#x60; - The video is available for streaming.  * &#x60;purchased&#x60; - The user has purchased the video.  * &#x60;restricted&#x60; - The user isn&#39;t permitted to stream the video.  * &#x60;unavailable&#x60; - The video isn&#39;t available for streaming.  |  |
|**uri** | **String** | The product URI to rent the On Demand video. |  |



## Enum: StreamEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| PURCHASED | &quot;purchased&quot; |
| RESTRICTED | &quot;restricted&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |



