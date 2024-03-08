

# OnDemandVideo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the video. |  [optional] |
|**buy** | [**OnDemandVideoBuy**](OnDemandVideoBuy.md) |  |  |
|**duration** | **String** | The duration of the video. |  [optional] |
|**episode** | **Double** | The episode number of the video. |  [optional] |
|**interactions** | [**OnDemandVideoInteractions**](OnDemandVideoInteractions.md) |  |  |
|**link** | **String** | The link to the video on Vimeo. |  |
|**metadata** | [**OnDemandVideoMetadata**](OnDemandVideoMetadata.md) |  |  |
|**name** | **String** | The title of the video. |  [optional] |
|**options** | **List&lt;String&gt;** | An array of HTTP methods permitted on this URI. |  [optional] |
|**pictures** | [**Picture**](Picture.md) | The active picture of the video. |  [optional] |
|**playProgress** | **Double** | The authenticated user&#39;s most recent play position in the video, in seconds. |  |
|**position** | **Double** | The position of the video relative to the other videos on the On Demand page. |  [optional] |
|**releaseDate** | **String** | The time in ISO 8601 format when the video was created or published. |  [optional] |
|**releaseYear** | **Double** | The year that the video was released. |  |
|**rent** | [**OnDemandVideoRent**](OnDemandVideoRent.md) |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of video.  Option descriptions:  * &#x60;extra&#x60; - The video is an extra feature.  * &#x60;main&#x60; - The video is a main feature.  * &#x60;trailer&#x60; - The video is a trailer.  |  |
|**uri** | **String** | The video container&#39;s relative URI. |  |
|**user** | [**User**](User.md) | The owner of the video. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXTRA | &quot;extra&quot; |
| MAIN | &quot;main&quot; |
| TRAILER | &quot;trailer&quot; |



