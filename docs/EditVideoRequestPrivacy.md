

# EditVideoRequestPrivacy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**add** | **Boolean** | Whether a user can add the video to a showcase, channel, or group. |  [optional] |
|**comments** | [**CommentsEnum**](#CommentsEnum) | The privacy level required to comment on the video.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can comment on the video.  * &#x60;contacts&#x60; - Only the owner&#39;s contacts can comment on the video.  * &#x60;nobody&#x60; - No one can comment on the video.  |  [optional] |
|**download** | **Boolean** | Whether a user can download the video. This field isn&#39;t available to Vimeo Free members. |  [optional] |
|**embed** | [**EmbedEnum**](#EmbedEnum) | The video&#39;s embed setting. Specify the &#x60;whitelist&#x60; value to restrict embedding to a specific set of domains. For more information, see our [Interacting with Videos](https://developer.vimeo.com/api/guides/videos/interact#set-off-site-privacy) guide.  Option descriptions:  * &#x60;private&#x60; - The video can&#39;t be embedded.  * &#x60;public&#x60; - The video can be embedded.  * &#x60;whitelist&#x60; - The video can be embedded on the specified domains only.  |  [optional] |
|**view** | [**ViewEnum**](#ViewEnum) | The video&#39;s privacy setting. When this value is &#x60;users&#x60;, &#x60;application/json&#x60; is the only valid content type. Also, some privacy settings are unavailable to Vimeo Free members; for more information, see our [Help Center](https://vimeo.zendesk.com/hc/en-us/articles/224817847).  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the video. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;contacts&#x60; - Only those who follow the owner on Vimeo can access the video. _This field is deprecated._  * &#x60;disable&#x60; - The video is embeddable, but it&#39;s hidden on Vimeo and can&#39;t be played. This privacy setting appears as &#x60;Hide from Vimeo&#x60; on the Vimeo front end. _This field is deprecated._  * &#x60;nobody&#x60; - No one except the owner can access the video. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Only those with the password can access the video.  * &#x60;unlisted&#x60; - Only those with the private link can access the video.  * &#x60;users&#x60; - Only Vimeo members can access the video. _This field is deprecated._  |  [optional] |



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
| UNLISTED | &quot;unlisted&quot; |
| USERS | &quot;users&quot; |



