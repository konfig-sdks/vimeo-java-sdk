

# VideoMetadataInteractionsBuy

The Buy interaction for the On Demand video.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | The currency code for the user&#39;s region. |  |
|**displayPrice** | **String** | The formatted display price for buying the On Demand video. |  |
|**download** | [**DownloadEnum**](#DownloadEnum) | The user&#39;s download access to the On Demand video.  Option descriptions:  * &#x60;available&#x60; - The video is available for download.  * &#x60;purchased&#x60; - The user has purchased the video.  * &#x60;restricted&#x60; - The user isn&#39;t permitted to download the video.  * &#x60;unavailable&#x60; - The video isn&#39;t available for download.  |  |
|**drm** | **Boolean** | Whether the On Demand video has DRM. |  |
|**link** | **String** | The URL to buy the On Demand video on Vimeo. |  |
|**price** | **Double** | The price to buy the On Demand video. |  |
|**purchaseTime** | **String** | The time in ISO 8601 format when the On Demand video was purchased. |  |
|**stream** | [**StreamEnum**](#StreamEnum) | The user&#39;s streaming access to the On Demand video.  Option descriptions:  * &#x60;available&#x60; - The video is available for streaming.  * &#x60;purchased&#x60; - The user has purchased the video.  * &#x60;restricted&#x60; - The user isn&#39;t permitted to stream the video.  * &#x60;unavailable&#x60; - The video isn&#39;t available for streaming  |  |
|**uri** | **String** | The product URI to purchase the On Demand video. |  |



## Enum: DownloadEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| PURCHASED | &quot;purchased&quot; |
| RESTRICTED | &quot;restricted&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |



## Enum: StreamEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| PURCHASED | &quot;purchased&quot; |
| RESTRICTED | &quot;restricted&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |



