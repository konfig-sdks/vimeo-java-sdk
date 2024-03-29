

# UserPreferencesVideosPrivacy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**add** | **Boolean** | Whether other users can add the authenticated user&#39;s videos. |  [optional] |
|**comments** | [**CommentsEnum**](#CommentsEnum) | The authenticated user&#39;s privacy preference for comments.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can comment on the user&#39;s videos.  * &#x60;contacts&#x60; - Only contacts can comment on the user&#39;s videos.  * &#x60;nobody&#x60; - No one can comment on the user&#39;s videos.  |  [optional] |
|**download** | **Boolean** | Whether other users can download the authenticated user&#39;s videos. |  [optional] |
|**embed** | [**EmbedEnum**](#EmbedEnum) | The authenticated user&#39;s privacy preference for embeds.  Option descriptions:  * &#x60;private&#x60; - Only the user can embed their own videos.  * &#x60;public&#x60; - Anyone can embed the user&#39;s videos.  * &#x60;whitelist&#x60; - Only those on the whitelist can embed the user&#39;s videos.  |  [optional] |
|**password** | **String** | The default password for the video. |  [optional] |
|**view** | [**ViewEnum**](#ViewEnum) | The authenticated user&#39;s privacy preference for views.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can view the user&#39;s videos. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;contacts&#x60; - Only contacts can view the user&#39;s videos. _This field is deprecated._  * &#x60;disable&#x60; - Views are disabled for the user&#39;s videos. This privacy setting appears as &#x60;Hide from Vimeo&#x60; on the Vimeo front end.  * &#x60;nobody&#x60; - No one except the user can view the user&#39;s videos. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Only those with the password can view the user&#39;s videos.  * &#x60;unlisted&#x60; - Anybody can view the user&#39;s videos if they have a link.  * &#x60;users&#x60; - Only other Vimeo members can view the user&#39;s videos. _This field is deprecated._  |  [optional] |



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



