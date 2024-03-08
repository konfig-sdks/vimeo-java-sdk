

# OnDemandVideosAddVideoToPageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buy** | [**OnDemandVideosAddVideoToPageRequestBuy**](OnDemandVideosAddVideoToPageRequestBuy.md) |  |  [optional] |
|**position** | **Double** | The position of the video in the On Demand collection. |  [optional] |
|**releaseYear** | **Double** | The release year of the video. |  [optional] |
|**rent** | [**OnDemandVideosAddVideoToPageRequestRent**](OnDemandVideosAddVideoToPageRequestRent.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the video.  Option descriptions:  * &#x60;extra&#x60; - The video type is extra footage.  * &#x60;main&#x60; - The video type is the main video.  * &#x60;trailer&#x60; - The video type is a trailer.  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXTRA | &quot;extra&quot; |
| MAIN | &quot;main&quot; |
| TRAILER | &quot;trailer&quot; |



