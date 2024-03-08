

# VideoPrivacy

The video's privacy setting.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**add** | **Boolean** | Whether the video can be added to collections. |  |
|**allowShareLink** | **Boolean** | Whether the share link is usable. |  |
|**comments** | [**CommentsEnum**](#CommentsEnum) | The video&#39;s comment permission setting.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can comment on the video.  * &#x60;contacts&#x60; - Only contacts can comment on the video.  * &#x60;nobody&#x60; - No one can comment on the video.  |  |
|**download** | **Boolean** | Whether the video can be downloaded. |  |
|**embed** | [**EmbedEnum**](#EmbedEnum) | The video&#39;s embed permission setting.  Option descriptions:  * &#x60;private&#x60; - The video is private.  * &#x60;public&#x60; - Anyone can embed the video.  * &#x60;whitelist&#x60; - The video can be embedded on specific domains.  |  |
|**view** | [**ViewEnum**](#ViewEnum) | The general privacy setting of the video.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the video. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;contacts&#x60; - Only contacts can access the video. _This field is deprecated._  * &#x60;disable&#x60; - The video is hidden from Vimeo. This privacy setting appears as &#x60;Hide from Vimeo&#x60; on the Vimeo front end.  * &#x60;nobody&#x60; - No one besides the owner can access the video. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Anyone with the video&#39;s password can access the video.  * &#x60;ptv&#x60; - The Vimeo On Demand video is accessible and searchable from Vimeo. _This field is deprecated._  * &#x60;ptvhide&#x60; - The Vimeo On Demand video is hidden from Vimeo. _This field is deprecated._  * &#x60;stock&#x60; - The stock footage is accessible and searchable from Vimeo. _This field is deprecated._  * &#x60;stock_purchased&#x60; - The purchased stock footage is accessible and searchable from Vimeo. _This field is deprecated._  * &#x60;unlisted&#x60; - The video is accessible but not searchable from Vimeo.  * &#x60;users&#x60; - Only Vimeo members can access the video. _This field is deprecated._  |  |



## Enum: CommentsEnum

| Name | Value |
|---- | -----|
| ANYBODY | &quot;anybody&quot; |
| CONTACTS | &quot;contacts&quot; |
| NOBODY | &quot;nobody&quot; |



## Enum: EmbedEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| PUBLIC | &quot;public&quot; |
| WHITELIST | &quot;whitelist&quot; |



## Enum: ViewEnum

| Name | Value |
|---- | -----|
| ANYBODY | &quot;anybody&quot; |
| CONTACTS | &quot;contacts&quot; |
| DISABLE | &quot;disable&quot; |
| NOBODY | &quot;nobody&quot; |
| PASSWORD | &quot;password&quot; |
| PTV | &quot;ptv&quot; |
| PTVHIDE | &quot;ptvhide&quot; |
| STOCK | &quot;stock&quot; |
| STOCK_PURCHASED | &quot;stock_purchased&quot; |
| UNLISTED | &quot;unlisted&quot; |
| USERS | &quot;users&quot; |



