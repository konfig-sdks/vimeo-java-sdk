

# EditUserRequestVideosPrivacy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**add** | **Boolean** | Whether the user can add videos to showcases, channels, or groups by default. |  [optional] |
|**comments** | [**CommentsEnum**](#CommentsEnum) | Who can comment on the user&#39;s video uploads by default.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can comment.  * &#x60;contacts&#x60; - Only the user&#39;s contacts can comment.  * &#x60;nobody&#x60; - No one can comment.  |  [optional] |
|**download** | **Boolean** | Whether the user can download videos. This value becomes the default download setting for all future videos that the user uploads. |  [optional] |
|**embed** | [**EmbedEnum**](#EmbedEnum) | The privacy for the user&#39;s embedded videos. The whitelist value enables you to define all valid embeddable domains. See our [Interacting with Videos](https://developer.vimeo.com/api/guides/videos/interact#set-off-site-privacy) guide for details on adding and removing domains.  Option descriptions:  * &#x60;private&#x60; - The videos can&#39;t be embedded on any domain.  * &#x60;public&#x60; - The videos can be embedded on any domain.  * &#x60;whitelist&#x60; - The videos can be embedded on the specified domains only.  |  [optional] |
|**view** | [**ViewEnum**](#ViewEnum) | Who can access the user&#39;s videos by default.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the videos. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;contacts&#x60; - Only the user&#39;s contacts can access the videos. _This field is deprecated._  * &#x60;disable&#x60; - The videos are disabled. This privacy setting appears as &#x60;Hide from Vimeo&#x60; on the Vimeo front end.  * &#x60;nobody&#x60; - No one can access the videos. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Only those with the password can access the videos.  * &#x60;unlisted&#x60; - The videos are unlisted.  * &#x60;users&#x60; - Only other Vimeo members can access the videos. _This field is deprecated._  |  [optional] |



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



